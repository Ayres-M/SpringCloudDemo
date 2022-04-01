package com.ayres.springcloud.service;

import com.ayres.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Ayres
 * @Date: 2022/3/19 14:24
 * @Description:
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}

