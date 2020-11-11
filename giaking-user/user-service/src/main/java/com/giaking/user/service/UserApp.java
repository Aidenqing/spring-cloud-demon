package com.giaking.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 17:10 2020/11/9
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.giaking")
public class UserApp {

    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }
}
