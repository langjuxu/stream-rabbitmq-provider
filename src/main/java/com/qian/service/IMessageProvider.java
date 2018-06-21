package com.qian.service;

import com.qian.entity.Order;

/**
 * @author qian
 * @date 2018/6/20
 */
public interface IMessageProvider {

    /**
     * 实现消息的发送，本次发送的消息是一个对象（自动变为json）
     *
     * @param order VO对象，该对象不为null
     */
    boolean send(Order order);

}
