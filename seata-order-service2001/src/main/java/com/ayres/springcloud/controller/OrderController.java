package com.ayres.springcloud.controller;

import com.ayres.springcloud.domain.CommonResult;
import com.ayres.springcloud.domain.Order;
import com.ayres.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Ayres
 * @Date: 2022/3/31 20:02
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}

