package com.cn.yc.configserverclient.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
   @Autowired
   private Environment env;


    @GetMapping("/from")
    public String getK(){
        System.out.println(env.getProperty("token"));
        return env.getProperty("token");
    }
}
