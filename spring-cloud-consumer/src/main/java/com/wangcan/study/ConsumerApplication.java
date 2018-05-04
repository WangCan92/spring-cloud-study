package com.wangcan.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @autor wangcan
 * @date 2018/5/4 上午10:01
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        System.out.println("==================消费启动开始==================");
        SpringApplication.run(ConsumerApplication.class,args);
        System.out.println("==================消费启动结束==================");
    }
}
