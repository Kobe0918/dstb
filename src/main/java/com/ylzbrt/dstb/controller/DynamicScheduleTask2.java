package com.ylzbrt.dstb.controller;

import com.alibaba.excel.util.StringUtils;
import com.ylzbrt.dstb.entity.ZwDynamicConfigEntity;
import com.ylzbrt.dstb.service.IDstbService2;
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
    public Logger logger = LoggerFactory.getLogger(getClass());

    private volatile ScheduledTaskRegistrar registrar;

    private final ConcurrentHashMap<String, ScheduledFuture<?>> scheduledFutures = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<String, CronTask> cronTasks = new ConcurrentHashMap<>();

    @Autowired
    private IDstbService2 IDstbService;

    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(20));
        this.registrar = scheduledTaskRegistrar;
    }

    public void refreshTask(List<ZwDynamicConfigEntity> tasks) {
        Set<String> tids = this.scheduledFutures.keySet();
        for (String tid : tids) {
            if (!exists(tasks, tid))
                ((ScheduledFuture) this.scheduledFutures.get(tid)).cancel(false);
        }
        for (ZwDynamicConfigEntity task : tasks) {
            String expression = task.getCronExpression();
            final String tid = task.getTid();
            if (StringUtils.isEmpty(task))
                continue;
            if (this.scheduledFutures.containsKey(tid) && ((CronTask) this.cronTasks.get(tid)).getExpression().equals(expression))
                continue;
            if (this.scheduledFutures.containsKey(tid)) {
                ((ScheduledFuture) this.scheduledFutures.get(tid)).cancel(false);
                this.scheduledFutures.remove(tid);
                this.cronTasks.remove(tid);
            }
            CronTask cronTask = new CronTask(new Runnable() {
                public void run() {
                    switch (tid) {
                        case "WEB2382_390":
                            DynamicScheduleTask2.this.IDstbService.zwAc43390IncrementData();
                            break;
                        case "WEB2382":
                            DynamicScheduleTask2.this.IDstbService.zwAc43IncrementData();
                            break;
                        case "WEB2385":
                            DynamicScheduleTask2.this.IDstbService.zwKc26IncrementData();
                            break;
                        case "WEB2388":
                            DynamicScheduleTask2.this.IDstbService.zwKc01IncrementData();
                            break;
                        case "WEB2389":
                            DynamicScheduleTask2.this.IDstbService.zwKc99IncrementData();
                            break;
                        case "WEB2390":
                            DynamicScheduleTask2.this.IDstbService.zwAc01IncrementData();
                            break;
                        case "WEB2384":
                            DynamicScheduleTask2.this.IDstbService.zwKslwIncrementData();
                            break;
                        case "WEB2387":
                            DynamicScheduleTask2.this.IDstbService.zwKa08IncrementData();
                            break;
                        case "WEB6064":
                            DynamicScheduleTask2.this.IDstbService.zwTrrymxYdIncrementData();
                            break;
                        case "ERRORDATA":
                            DynamicScheduleTask2.this.IDstbService.zwSjtsLog();
                            break;
                    }
                }
            }, expression);
            ScheduledFuture<?> future = this.registrar.getScheduler().schedule(cronTask.getRunnable(), cronTask.getTrigger());
            this.cronTasks.put(tid, cronTask);
            this.scheduledFutures.put(task.getTid(), future);
        }
    }

    private boolean exists(List<ZwDynamicConfigEntity> tasks, String tid) {
        for (ZwDynamicConfigEntity s : tasks) {
            if (tid.equals(s.getTid()))
                return true;
        }
        return false;
    }
}
