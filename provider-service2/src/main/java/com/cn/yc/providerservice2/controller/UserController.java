package com.cn.yc.providerservice2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/login")
    public  String login(@RequestParam("count") int count) throws  Exception {
        logger.info("access @ provider 2 8088 as " + count);
        return "用户已验证";
    }

}
