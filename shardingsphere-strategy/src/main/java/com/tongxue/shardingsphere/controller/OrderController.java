package com.tongxue.shardingsphere.controller;


import cn.hutool.core.util.IdUtil;
import com.tongxue.shardingsphere.entity.Order;
import com.tongxue.shardingsphere.entity.UserOrder;
import com.tongxue.shardingsphere.mapper.OrderMapper;
import com.tongxue.shardingsphere.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/save")
    public Order insert() {
        Order order = new Order();
        order.setCreateTime(new Date());
        order.setOrderNumber(IdUtil.fastSimpleUUID());
        order.setProductId(IdUtil.getSnowflake().nextId());
        order.setUserId(IdUtil.getSnowflake().nextId());
        orderMapper.addOrder(order);
        return order;
    }

}
