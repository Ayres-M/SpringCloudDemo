package com.ayres.springcloud.service.impl;

import com.ayres.springcloud.dao.AccountDao;
import com.ayres.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Auther: Ayres
 * @Date: 2022/4/1 20:25
 * @Description:
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("---> AccountService中扣减账户余额");
        //模拟超时异常，暂停20秒
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int i = 1 / 0;
        accountDao.decrease(userId, money);
        LOGGER.info("---> AccountService中扣减账户余额完成");
    }
}

