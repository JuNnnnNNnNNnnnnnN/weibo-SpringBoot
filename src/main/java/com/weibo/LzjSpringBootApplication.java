    package com.weibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.weibo.dao"})
@SpringBootApplication
public class LzjSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzjSpringBootApplication.class, args);
    }

}
