package com.ayres.springcloud.service.impl;

import com.ayres.springcloud.dao.OrderDao;
import com.ayres.springcloud.domain.Order;
import com.ayres.springcloud.service.AccountService;
import com.ayres.springcloud.service.OrderService;
import com.ayres.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Ayres
 * @Date: 2022/3/31 19:56
 * @Description:
 */
@Slf4j
@Service
public class OderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    //name随便命名，只要不重复即可
    //rollbackFor = Exception.class表示出现所有异常都回滚
    //rollbackFor表示哪些需要回滚
    //noRollbackFor表示哪些不需要回滚
    @GlobalTransactional(name = "my_test_tx_group", rollbackFor = Exception.class)
    public void create(Order order) {
        //1. 新建订单
        log.info("-------> 开始新建订单");
        orderDao.create(order);

        //2. 扣减库存
        log.info("-------> 订单微服务开始调用库存，做扣减count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("-------> 订单微服务开始调用库存，做扣减完成");

        //3. 扣减账号余额
        log.info("-------> 订单微服务开始调用账号，做扣减money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("-------> 订单微服务开始调用账号，做扣减完成");

        //4. 修改订单状态，1代表已完成
        log.info("-------> 修改订单状态");
        orderDao.update(order.getUserId(), 0);
        log.info("-------> 修改订单状态完成");

        log.info("-------> 新建订单完成");
    }
}

