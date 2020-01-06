package com.yubing.serviceadmin.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-USER")
public interface ServiceUserFeignClient {
    @RequestMapping("/test")
    public String callServiceUser();
}
