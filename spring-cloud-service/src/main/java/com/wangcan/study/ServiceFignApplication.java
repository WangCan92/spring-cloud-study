package com.wangcan.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @autor wangcan
 * @date 2018/5/3 下午6:19
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFignApplication {
    public static void main(String[] args) {
        System.out.println("================服务提供方启动===================");
        SpringApplication.run(ServiceFignApplication.class,args);
        System.out.println("================服务提供方完成===================");
    }
}
