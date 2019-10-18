package com.cn.yc.gatewayzuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulServiceApplication.class, args);
    }

}
