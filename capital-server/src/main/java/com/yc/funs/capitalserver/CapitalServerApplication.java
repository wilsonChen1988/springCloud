package com.yc.funs.capitalserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CapitalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapitalServerApplication.class, args);
    }

}
