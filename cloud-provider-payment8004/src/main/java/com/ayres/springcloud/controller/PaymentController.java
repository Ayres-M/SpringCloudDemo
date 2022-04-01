package com.ayres.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: Ayres
 * @Date: 2022/3/22 18:51
 * @Description:
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")        //获取端口号
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper：" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}

