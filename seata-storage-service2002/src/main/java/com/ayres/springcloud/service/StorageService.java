package com.ayres.springcloud.service;

/**
 * @Auther: Ayres
 * @Date: 2022/4/1 20:00
 * @Description:
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}

