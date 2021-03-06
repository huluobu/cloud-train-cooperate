package com.carrot.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: carrot
 * @Date: 2020/10/24 21:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FilmManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(FilmManagerApp.class);
    }
}
