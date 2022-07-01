package com.tongxue.shardingsphere.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserOrder {

    // 主键
    private Long orderId;
    // 订单编号
    private String orderNumber;
    // 用户ID
    private Long userId;
    //
    private Date createTime;

    private String yearmonth;

}
