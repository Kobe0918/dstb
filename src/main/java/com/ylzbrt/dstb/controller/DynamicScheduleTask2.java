package com.ylzbrt.dstb.controller;


import com.alibaba.excel.util.StringUtils;
import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.entity.ZwDynamicConfigEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;

@Configuration
public class DynamicScheduleTask2 implements SchedulingConfigurer {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    private volatile ScheduledTaskRegistrar registrar;
    private final ConcurrentHashMap<String, ScheduledFuture<?>> scheduledFutures = new ConcurrentHashMap<String, ScheduledFuture<?>>();
    private final ConcurrentHashMap<String, CronTask> cronTasks = new ConcurrentHashMap<String, CronTask>();

    @Autowired
    private com.ylzbrt.dstb.service.IDstbService2 IDstbService;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(20));
        this.registrar = scheduledTaskRegistrar;
    }

    public void refreshTask(List<ZwDynamicConfigEntity> tasks) {
        //取消已经删除的策略任务
        Set<String> tids = scheduledFutures.keySet();
        for (String tid : tids) {
            if (!exists(tasks, tid)) {
                scheduledFutures.get(tid).cancel(false);
            }
        }
        for (ZwDynamicConfigEntity task : tasks) {
            //cron表达式
            String expression = task.getCronExpression();
            String tid = task.getTid();
            //表达式为空，跳过
            if (StringUtils.isEmpty(task)) {
                continue;
            }
            //计划任务已存在并且表达式未发生变化则跳过
            if (scheduledFutures.containsKey(tid) && cronTasks.get(tid).getExpression().equals(expression)) {
                continue;
            }
            //如果策略执行时间发生了变化，则取消当前策略的任务
            if (scheduledFutures.containsKey(tid)) {
                scheduledFutures.get(tid).cancel(false);
                scheduledFutures.remove(tid);
                cronTasks.remove(tid);
            }

            CronTask cronTask = new CronTask(new Runnable() {
                @Override
                public void run() {
                    //每个计划任务实际需要执行的具体业务逻辑
                    switch (tid) {
//                        case "WEB2382_390":
//                            IDstbService.zwAc43390IncrementData();
//                            break;
//                        case Catalog.ac43:
//                            IDstbService.zwAc43Test();
//                            break;


//                         case Catalog.kc26:
//                            IDstbService.zwKc26IncrementData();
//                            break;


                        case Catalog.kc01:
                            IDstbService.zwKc01IncrementData();
                            break;
                        case Catalog.kc99:
                            IDstbService.zwKc99IncrementData();
                            break;
                        case Catalog.ac01:
                            IDstbService.zwAc01IncrementData();
                            break;
                        case Catalog.kslw:
                            IDstbService.zwKslwIncrementData();
                            break;
                        case Catalog.ka08:
                            IDstbService.zwKa08IncrementData();
                            break;

                        case "ERRORDATA":
                            IDstbService.zwSjtsLog();
                            break;
                        default:
                            ;
                            break;
                    }
                }
            }, expression);
            ScheduledFuture<?> future = registrar.getScheduler().schedule(cronTask.getRunnable(), cronTask.getTrigger());
            cronTasks.put(tid, cronTask);
            scheduledFutures.put(task.getTid(), future);
        }
    }

    private boolean exists(List<ZwDynamicConfigEntity> tasks, String tid) {
        for (ZwDynamicConfigEntity s : tasks) {
            if (tid.equals(s.getTid())) {
                return true;
            }
        }
        return false;
    }

}
