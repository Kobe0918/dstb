package com.ylzbrt.dstb;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync  //开启异步调用
@EnableScheduling  //开启定时任务
//@EnableCaching  //开启缓存
@MapperScan(basePackages = "com.ylzbrt.dstb.mapper,com.ylzbrt.dstb.controller") // Dao
@ServletComponentScan
public class DstbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DstbApplication.class, args);

        Logger logger = LoggerFactory.getLogger(DstbApplication.class);
        logger.info("Started Success!!!");
    }

}
