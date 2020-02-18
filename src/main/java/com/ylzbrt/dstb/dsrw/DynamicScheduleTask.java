package com.ylzbrt.dstb.dsrw;

import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.entity.ConfigEntity;
import com.ylzbrt.dstb.service.DsrwService;
import com.ylzbrt.dstb.service.DsrwTService;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

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

    @Autowired
    private DsrwService dsrwService;

    public static ConfigEntity configEntity;
    public static Client webService;

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
                    dsrwTService.zwKa08();
                    dsrwTService.zwKslw();


                    String opt = Catalog.add;
                    //6-19
                    dsrwService.dealQslwFwwdb0(opt);
                    dsrwService.dealKb01(opt);
                    dsrwService.dealKa02(opt);
                    dsrwService.dealKa03(opt);
                    dsrwService.dealKa17Yp(opt);
                    dsrwService.dealKa17(opt);
                    dsrwService.dealKy65(opt);
                    dsrwService.dealMc01(opt);
                    dsrwService.dealMca1(opt);
                    dsrwService.dealMc03(opt);
                    dsrwService.dealMy56(opt);
                    dsrwService.dealKy70(opt);
                },
                triggerContext -> {
                    String cron = configMapper.selectCron();
                    configEntity = configMapper.selectConfig();
                    webService = WbClient.getWebService();
                    if (StringUtils.isEmpty(cron)) {
                        cron = "0/10 * * * * ?";  //设置默认更新时间
                    }
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                });
    }
}
