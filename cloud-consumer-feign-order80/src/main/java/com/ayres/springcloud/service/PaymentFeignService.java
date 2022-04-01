package com.ayres.springcloud.service;

import com.ayres.springcloud.entities.CommonResult;
import com.ayres.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: Ayres
 * @Date: 2022/3/24 19:41
 * @Description:
 */
//Feign封装了Ribbon和RestTemplate，实现负载均衡和发送请求
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")    //作为feign的接口，找CLOUD-PAYMENT-SERVICE服务
public interface PaymentFeignService {

    //直接复制8001的方法
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}

