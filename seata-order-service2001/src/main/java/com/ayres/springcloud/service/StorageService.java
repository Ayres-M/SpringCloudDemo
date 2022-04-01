package com.ayres.springcloud.service;

import com.ayres.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Ayres
 * @Date: 2022/3/31 19:54
 * @Description:
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    //减库存
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

