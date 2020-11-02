package com.ylzbrt.dstb.test;

public class MultiThreadDemo implements Runnable {


    private MultiThreadProcessService multiThreadProcessService;

    public MultiThreadDemo() {
    }

    public MultiThreadDemo(MultiThreadProcessService multiThreadProcessService) {
        this.multiThreadProcessService = multiThreadProcessService;
    }

    @Override
    public void run() {
        multiThreadProcessService.processSomething();
    }
}
