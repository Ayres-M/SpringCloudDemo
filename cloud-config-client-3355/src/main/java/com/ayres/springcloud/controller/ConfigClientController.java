package com.ayres.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ayres
 * @Date: 2022/3/26 21:09
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")	//spring的@Value注解
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }

}

