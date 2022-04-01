package com.ayres.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther: Ayres
 * @Date: 2022/3/25 20:26
 * @Description:
 */
@EnableHystrixDashboard //启用Hystrix仪表板
@SpringBootApplication
public class HystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
    }

}

