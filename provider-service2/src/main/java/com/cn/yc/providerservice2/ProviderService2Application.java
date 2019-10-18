package com.cn.yc.providerservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService2Application.class, args);
    }

}
