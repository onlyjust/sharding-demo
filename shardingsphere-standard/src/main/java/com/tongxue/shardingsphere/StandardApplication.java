package com.tongxue.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tongxue.shardingsphere.mapper")
public class StandardApplication {

    public static void main(String[] args) {
        SpringApplication.run(StandardApplication.class, args);
    }
}
