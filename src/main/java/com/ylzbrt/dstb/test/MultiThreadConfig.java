package com.ylzbrt.dstb.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = {"com.ylzbrt.dstb.test"})
//@ImportResource("classpath:/application-task.xml" )
@EnableScheduling
public class MultiThreadConfig {
}
