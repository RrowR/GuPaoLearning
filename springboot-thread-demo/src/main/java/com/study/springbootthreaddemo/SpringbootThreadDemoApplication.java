package com.study.springbootthreaddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.study.springbootthreaddemo.mapper")
@SpringBootApplication
public class SpringbootThreadDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThreadDemoApplication.class, args);
    }

}
