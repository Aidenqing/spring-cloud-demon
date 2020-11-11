package com.giaking.gateway;

import com.giaking.gateway.filter.CommonAuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 15:21 2020/11/9
 */

@SpringBootApplication
@EnableDiscoveryClient

public class GateWayApp {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApp.class,args);
    }

    @Bean
    public CommonAuthFilter authFilter(){
        return new CommonAuthFilter();
    }
}
