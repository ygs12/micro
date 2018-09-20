package com.cloud.demo.proivder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProivderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProivderApplication.class, args);
    }
}
