package com.ayres.springcloud.dao;

import com.ayres.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Ayres
 * @Date: 2022/3/31 19:47
 * @Description:
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    int create(Order order);

    //2 修改订单状态,从0改为1
    int update(@Param("userId") Long userId, @Param("status") Integer status);

}

