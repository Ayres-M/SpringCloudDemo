package com.ayres.springcloud.service.impl;

import com.ayres.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther: Ayres
 * @Date: 2022/3/27 19:49
 * @Description:
 */
@EnableBinding(Source.class)    //定义消息的推送管道（Source是spring的）
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());     //MessageBuilder是spring的integration.support.MessageBuilder
        System.out.println("*******serial: " + serial);
        return null;
    }
}
