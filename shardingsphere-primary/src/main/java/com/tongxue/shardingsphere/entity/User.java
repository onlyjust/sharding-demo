package com.tongxue.shardingsphere.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {

    private Integer id;

    private String nickname;

    private Integer age;

    private String password;

    private Integer sex;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
