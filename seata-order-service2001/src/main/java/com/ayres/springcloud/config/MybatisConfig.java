package com.ayres.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Ayres
 * @Date: 2022/3/31 20:03
 * @Description:
 */
@MapperScan("com.ayres.springcloud.dao")
@Configuration
public class MybatisConfig {
}
