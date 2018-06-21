package com.qian.controller;

import com.qian.entity.Order;
import com.qian.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author qian
 * @date 2018/6/20
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/changeMessage", produces = "application/json;charset=UTF-8")
    public String changeMessage(String type) {
        System.err.println("##########调用provider成功>>>>>>>>>>>>>>>>>>>>>>>>>>>" + type);
        Order order = new Order();
        order.setOrderNum("0000002");
        order.setNum(10);
        order.setType(type);
        order.setCreateAt(new Date());
        boolean send = messageProvider.send(order);

        return send ? "success" : "false";
    }
}
