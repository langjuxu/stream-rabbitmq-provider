package com.qian.service.impl;

import com.qian.entity.Order;
import com.qian.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @author qian
 * @date 2018/6/20
 */
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息的发送管道

    /**
     * 实现消息的发送，本次发送的消息是一个对象（自动变为json）
     *
     * @param order VO对象，该对象不为null
     */
    @Override
    public boolean send(Order order) {
        System.err.println("发送消息************************");
        boolean send = this.output.send(MessageBuilder.withPayload(order).build());// 创建并发送消息
        return send;
    }
}
