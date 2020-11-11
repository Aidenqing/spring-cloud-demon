package com.giakin.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 17:36 2020/11/9
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.giaking")
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
