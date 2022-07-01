package com.tongxue.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tongxue.shardingsphere.mapper")
public class PrimaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimaryApplication.class, args);
    }
}
