package com.ylzbrt.dstb.dsrw;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.ylzbrt.dstb.entity.ConfigEntity;
import com.ylzbrt.dstb.service.DsrwTService;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.servlet.Servlet;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.dsrw
 * @Author: lzh
 * @CreateTime: 2020-01-13 11:10
 * @Description: ${Description}
 */
@Configuration
public class DynamicScheduleTask implements SchedulingConfigurer {

    @Mapper
    @Repository
    public interface ConfigMapper {
        @Select("select cron  from zw_cron  WHERE ROWNUM = 1")
        String selectCron();

        @Select("select * from zw_config WHERE ROWNUM = 1")
        ConfigEntity selectConfig();
    }

    @Autowired
    @SuppressWarnings("all")
    ConfigMapper configMapper;

    @Autowired
    private DsrwTService dsrwTService;

    public static ConfigEntity configEntity;
    public static Client client;


    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//           scheduledTaskRegistrar.addTriggerTask(new Runnable() {
//               @Override
//               public void run() {
//                   System.out.println("nihao ");
//               }
//           }, new Trigger() {
//               @Override
//               public Date nextExecutionTime(TriggerContext triggerContext) {
//                   String cron  = cronConfigMapper.selectCron();
//                   if (StringUtils.isEmpty(cron)){
//                       cron = "";//设置默认更新时间
//                   }
//                   return new CronTrigger(cron).nextExecutionTime(triggerContext);
//               }
//           });


        scheduledTaskRegistrar.addTriggerTask(() -> {
                   dsrwTService.zwAc01();
                    //dsrwTService.zwKa08();
                    // dsrwTService.zwKslw();
                },
                triggerContext -> {
                    String cron = configMapper.selectCron();
                    configEntity = configMapper.selectConfig();
                    client = WbClient.getWebService();
                    if (StringUtils.isEmpty(cron)) {
                        cron = "0/20 * * * * ?";  //设置默认更新时间
                    }
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                });
    }

    /**
     * 默认情况下，在创建了线程池后，线程池中的线程数为0，当有任务来之后，就会创建一个线程去执行任务，
     * 当线程池中的线程数目达到corePoolSize后，就会把到达的任务放到缓存队列当中；
     * 当队列满了，就继续创建线程，当线程数量大于等于maxPoolSize后，开始使用拒绝策略拒绝
     *
     * 自定义异步线程池
     * @return
     */
    @Bean(name = "asyncServiceExecutor")
    public Executor asyncServiceExecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //配置核心线程数  线程池创建时候初始化的线程数
        executor.setCorePoolSize(20);
        //配置最大线程数，只有当缓冲队列满了，才会申请超过核心线程数上的线程
        executor.setMaxPoolSize(50);
        //配置队列大小
        executor.setQueueCapacity(100);
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("async_service");
        //线程空闲时间60s 超过销毁
        executor.setKeepAliveSeconds(20);

        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }



    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }

    /**
     * 配置访问druid后台检测
     * @return
     */
    @Bean
    public ServletRegistrationBean StatViewServlet(){
        ServletRegistrationBean <Servlet> bean = new ServletRegistrationBean <>(new StatViewServlet());
        bean.addUrlMappings("/druid/*");
        bean.addInitParameter("loginUsername","admin");
        bean.addInitParameter("loginPassword","admin");
        return bean;
    }

    /**
     * 配置druid监控设置
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
        bean.addUrlPatterns("/*");
        bean.addInitParameter("exclusions","*.js, *.css, /druid/*");
        return bean;
    }
}
