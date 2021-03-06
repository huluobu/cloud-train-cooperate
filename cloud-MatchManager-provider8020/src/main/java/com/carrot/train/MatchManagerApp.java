package com.carrot.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: carrot
 * @Date: 2020/10/27 10:29
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MatchManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(MatchManagerApp.class);
    }
}
