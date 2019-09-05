package com.bf.slow;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bf.slow.dao")
@EnableDubbo(scanBasePackages = "com.bf.slow.api")
public class BfUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BfUserServiceApplication.class, args);
    }

}
