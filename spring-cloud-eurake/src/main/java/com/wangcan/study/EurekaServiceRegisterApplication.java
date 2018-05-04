package com.wangcan.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autor wangcan
 * @date 2018/5/3 下午5:54
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegisterApplication {

    public static void main(String[] args) {
        System.out.println("==============开始启动eurekaService==================");
        SpringApplication.run(EurekaServiceRegisterApplication.class,args);
        System.out.println("==============eurekaService启动结束==================");
    }
}
