package com.qian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author qian
 * @date 2018/6/20
 */
@Data
public class Order {

    private String orderNum;

    private String type;

    private int num;

    private Date createAt;
}
