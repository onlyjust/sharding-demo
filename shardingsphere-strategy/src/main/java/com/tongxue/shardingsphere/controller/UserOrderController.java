package com.tongxue.shardingsphere.controller;


import cn.hutool.core.util.IdUtil;
import com.tongxue.shardingsphere.entity.User;
import com.tongxue.shardingsphere.entity.UserOrder;
import com.tongxue.shardingsphere.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@RestController
@RequestMapping("/user/order")
public class UserOrderController {
    @Autowired
    private UserOrderMapper userOrderMapper;

    @GetMapping("/save")
    public UserOrder insert(String yearmonth) {
        UserOrder userOrder = new UserOrder();
        userOrder.setCreateTime(new Date());
        userOrder.setOrderNumber(IdUtil.fastSimpleUUID());
        if (Objects.isNull(yearmonth)){
            yearmonth = "202203";
        }
        userOrder.setYearmonth(yearmonth);
        userOrder.setUserId(IdUtil.getSnowflake().nextId());
        userOrderMapper.addUserOrder(userOrder);
        return userOrder;
    }

}
