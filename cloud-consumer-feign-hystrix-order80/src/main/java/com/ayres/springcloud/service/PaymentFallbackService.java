package com.ayres.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: Ayres
 * @Date: 2022/3/25 17:37
 * @Description:
 */
//统一为接口里面的方法进行异常处理
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_TimeOut----";
    }
}

