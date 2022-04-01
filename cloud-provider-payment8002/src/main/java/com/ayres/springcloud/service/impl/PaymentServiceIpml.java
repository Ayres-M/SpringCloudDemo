package com.ayres.springcloud.service.impl;

import com.ayres.springcloud.dao.PaymentDao;
import com.ayres.springcloud.entities.Payment;
import com.ayres.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Ayres
 * @Date: 2022/3/19 14:24
 * @Description:
 */
@Service
public class PaymentServiceIpml implements PaymentService {

    @Resource   //@Autowired也可以
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
