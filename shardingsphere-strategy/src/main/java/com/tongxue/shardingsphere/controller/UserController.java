package com.tongxue.shardingsphere.controller;


import com.tongxue.shardingsphere.entity.User;
import com.tongxue.shardingsphere.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/save")
    public User insert(User user) {
        user.setNickname("zhangsan" + new Random().nextInt());
        user.setPassword("1234567");
        user.setSex(new Random().nextInt(2));
        userMapper.addUser(user);
        return user;
    }

    @GetMapping("/listuser")
    public List<User> listuser() {
        return userMapper.findUsers();
    }
}
