package com.carrot.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: carrot
 * @Date: 2020/10/31 15:18
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApp {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApp.class, args);
    }

}
