package com.ayres.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ayres.springcloud.entities.CommonResult;

/**
 * @Auther: Ayres
 * @Date: 2022/3/30 16:54
 * @Description:
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 2");
    }
}

