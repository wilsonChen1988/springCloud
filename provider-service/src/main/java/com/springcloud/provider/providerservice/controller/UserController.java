package com.springcloud.provider.providerservice.controller;

import com.cn.model.UserBo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
/*    @GetMapping("/login")
    public String login(){
        return "用户已验证";
    }*/


  /*  @PostMapping("/login")
    public String login(@RequestBody UserBo userBo){
        if(userBo.getUserName().equals("admin") && userBo.getPassword().equals("123")){
            return "用户登入成功";
        }else{
            return "用户用户名密码错误";
        }

    }*/

    @PostMapping("/login")
    public  String login(@RequestParam("count") int count) throws  Exception {
        logger.info("access @ provider 8086 as " + count);
        return "用户已验证";
    }

}
