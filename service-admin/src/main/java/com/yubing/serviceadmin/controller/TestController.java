package com.yubing.serviceadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
@Autowired
private ServiceUserFeignClient serviceUserFeignClient;
    @RequestMapping("/test")
    public String testService(){
        return "service-admin is ok";
    }
    @RequestMapping("/call-service-user")
    public String callTest(){
        return serviceUserFeignClient.callServiceUser();
    }
}
