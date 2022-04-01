package com.ayres.springcloud.service;

import com.ayres.springcloud.entities.CommonResult;
import com.ayres.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Auther: Ayres
 * @Date: 2022/3/30 20:28
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}

