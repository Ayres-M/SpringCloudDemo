package com.ayres.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Ayres
 * @Date: 2022/4/1 20:05
 * @Description:
 */
@Configuration
@MapperScan({"com.ayres.springcloud.dao"})
public class MyBatisConfig {
}

