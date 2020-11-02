package com.ylzbrt.dstb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { MultiThreadConfig.class })
public class MultiThreadTest {


    private MultiThreadProcessService multiThreadProcessService = new MultiThreadProcessService();

    @Test
    public void test() {

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //配置核心线程数  线程池创建时候初始化的线程数
        taskExecutor.setCorePoolSize(20);
        //配置最大线程数，只有当缓冲队列满了，才会申请超过核心线程数上的线程
        taskExecutor.setMaxPoolSize(50);
        //配置队列大小
        taskExecutor.setQueueCapacity(100);
        //配置线程池中的线程的名称前缀
        taskExecutor.setThreadNamePrefix("async_service");
        //线程空闲时间60s 超过销毁
        taskExecutor.setKeepAliveSeconds(20);
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        taskExecutor.initialize();
        int n = 500;
        for (int i = 0; i < n; i++) {
            taskExecutor.execute(new MultiThreadDemo(multiThreadProcessService));
            System.out.println("int i is " + i + ", now threadpool active threads totalnum is " + taskExecutor.getActiveCount());
        }

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}