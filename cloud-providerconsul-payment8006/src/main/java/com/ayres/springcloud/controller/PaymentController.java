package com.ayres.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: Ayres
 * @Date: 2022/3/22 20:46
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")        //获取端口号
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul：" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}