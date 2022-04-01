package com.ayres.springcloud.service;

import java.math.BigDecimal;

/**
 * @Auther: Ayres
 * @Date: 2022/4/1 20:25
 * @Description:
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}

