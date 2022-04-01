package com.ayres.springcloud.config;
import feign.Logger;	//不要导错包
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Ayres
 * @Date: 2022/3/24 19:53
 * @Description:
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        //打印最详细的日志
        return Logger.Level.FULL;
    }

}

