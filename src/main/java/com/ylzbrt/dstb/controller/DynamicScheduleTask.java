package com.ylzbrt.dstb.controller;

import com.ylzbrt.dstb.entity.ConfigEntity;
import com.ylzbrt.dstb.service.IDsrwService;
import com.ylzbrt.dstb.service.IDstbService;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.controller
 * @Author: lzh
 * @CreateTime: 2020-01-13 11:10
 * @Description: ${Description}
 */
//@Configuration  implements SchedulingConfigurer
public class DynamicScheduleTask {

    @Mapper
    @Repository
    public interface ConfigMapper {
        //获取定时器 定时配置
        @Select("select cron  from zw_config  WHERE aaa027 = '350000'")
        String selectCron();

        // 获取政务webservice 账号密码，更新统筹区等信息。为了适配省直和泉州，两个统筹区的数据，需要在该表配置所需的aaa027
        @Select("select updator,aaa027,last_pass_time from zw_config where status = '1'")
        List<ConfigEntity> selectConfig();

        @Update("update  zw_config set last_pass_time = sysdate where aaa027 = '350000'")
        void updateConfgAfterPassDataToZw();
    }


    @Autowired
    @SuppressWarnings("all")
    ConfigMapper configMapper;
    @Autowired
    private IDstbService IDstbService;
    @Autowired
    private IDsrwService iDsrwService;
    public static List<ConfigEntity> configEntity;
    public static ConfigEntity configEntityOne;
    public static Client client = WbClient.getWebService();
    public static String action = "add";

    public Logger logger = LoggerFactory.getLogger(this.getClass());


    //启动项目生成定时器，执行任务
    // @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//
//        scheduledTaskRegistrar.addTriggerTask(() -> {
//                    try {
//                    logger.info("zw 开始更新");
//                    //错误数据推送
//                //    IDstbService.zwSjtsLog(2);
//                    for (ConfigEntity c : configEntity) {
//
//                        //人员基本信息
////                        IDstbService.zwAc01(c, action);
////                        //个人账户信息
////                        IDstbService.zwKc01(c, action);
////                        //特殊病种登记
////                        IDstbService.zwKa08(c, action);
////                        //跨省异地就医登记信息
////                        IDstbService.zwKslw(c, action);
////                        //人员参保信息
////                        IDstbService.zwKc99(c, action);
////                        //人员参保信息
////                        IDstbService.zwKc26(c, action);
//                        //缴费划拨信息
//                        if("350000".equals(c.getAaa027())){
//                            IDstbService.zwAc43(c, action);
//                        }
//
//
//                    }
//
//                 //   configMapper.updateConfgAfterPassDataToZw();
//
////                        全部的错误数据未推送
//
//                       // IDstbService.zwSjtsLog(1);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//
//                },
//                triggerContext -> {
//                    String cron = configMapper.selectCron();
//                    logger.info(cron + " : 定时配置");
//                    configEntity = configMapper.selectConfig();
//                    client = WbClient.getWebService();
//                    if (StringUtils.isEmpty(cron)) {
//                        cron = "0 0 8 ? * SAT";  //设置默认更新时间
//                    }
//                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
//                });
    }


}
