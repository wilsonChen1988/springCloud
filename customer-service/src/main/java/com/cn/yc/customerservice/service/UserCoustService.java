package com.cn.yc.customerservice.service;


import com.cn.model.UserBo;
import com.cn.yc.customerservice.service.impl.UserFeingHstrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/*@FeignClient(name="provider-service",fallback = UserFeingHstrix.class)*/
@FeignClient(name="provider-service")
public interface UserCoustService {
    /*@GetMapping("/login")
    public String login();*/

    /*@PostMapping("/login")
    public String login(@RequestBody UserBo userBo);*/
    @PostMapping("/login")
    public String login(@RequestParam("count") int count);
}
