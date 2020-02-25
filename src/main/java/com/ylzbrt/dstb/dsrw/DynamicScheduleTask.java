package com.ylzbrt.dstb.dsrw;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.entity.ConfigEntity;

import com.ylzbrt.dstb.service.DsrwTService;
import com.ylzbrt.dstb.service.IDsrwService;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.dsrw
 * @Author: 林泽航
 * @CreateTime: 2020-01-13 11:10
 * @Description: ${Description}
 */
@Configuration
public class DynamicScheduleTask implements SchedulingConfigurer {

    @Mapper
    @Repository
    public interface ConfigMapper {
        //获取定时器 定时配置
        @Select("select cron  from zw_cron  WHERE ROWNUM = 1")
        String selectCron();
       // 获取政务webservice 账号密码，更新统筹区等信息。为了适配省直和泉州，两个统筹区的数据，需要在该表配置所需的aaa027
        @Select("select * from zw_config ")
        List<ConfigEntity> selectConfig();

        @Select("select * from zw_config WHERE ROWNUM = 1")
        ConfigEntity selectConfigOne();
    }

    @Autowired
    @SuppressWarnings("all")
    ConfigMapper configMapper;
    @Autowired
    private DsrwTService dsrwTService;
    @Autowired
    private IDsrwService dsrwService;
    public static List<ConfigEntity> configEntity;
    public static ConfigEntity configEntityOne;
    public static Client client;

    public Logger logger = LoggerFactory.getLogger(this.getClass());


    //启动项目生成定时器，执行任务
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        scheduledTaskRegistrar.addTriggerTask(() -> {

            logger.info("zw 开始更新");

            for(ConfigEntity c : configEntity){
                dsrwTService.zwAc01(c);
                dsrwTService.zwKa08(c);
                dsrwTService.zwKslw(c);
                dsrwTService.zwKc01(c);
                dsrwTService.zwKc99(c);
                dsrwTService.zwAc43(c);
                dsrwTService.zwKc26(c);
            }



//                    String opt = Catalog.add;
//                    //6-19
//                    dsrwService.dealQslwFwwdb0(opt);
//                    dsrwService.dealKb01(opt);
//                    dsrwService.dealKa02(opt);
//                    dsrwService.dealKa03(opt);
//                    dsrwService.dealKa17Yp(opt);
//                    dsrwService.dealKa17(opt);
//                    dsrwService.dealKy65(opt);
//                    dsrwService.dealMc01(opt);
//                    dsrwService.dealMca1(opt);
//                    dsrwService.dealMc03(opt);
//                    dsrwService.dealMy56(opt);
//                    dsrwService.dealKy70(opt);

                },
                triggerContext -> {
                    String cron = configMapper.selectCron();
                     configEntity = configMapper.selectConfig();
                    configEntityOne =  configMapper.selectConfigOne();
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


//配置druid连接池
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
