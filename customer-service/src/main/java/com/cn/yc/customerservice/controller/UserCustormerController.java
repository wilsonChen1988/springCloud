package com.cn.yc.customerservice.controller;

import com.cn.model.UserBo;
import com.cn.yc.customerservice.service.UserCoustService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCustormerController {


    @Autowired(required = false)
    private UserCoustService userCoustService;
    @PostMapping("/userLogin")
    public String login(){
        /*UserBo user =new UserBo();
        user.setPassword(password);
        user.setUserName(username);
        return "收到结果：" + userCoustService.login(user);*/
        for(int i = 0 ;i< 10 ;i++){
            userCoustService.login(i);
        }
        return "负载均衡demo";
    }

}
