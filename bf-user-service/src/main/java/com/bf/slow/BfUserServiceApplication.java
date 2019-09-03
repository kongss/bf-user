package com.bf.slow;

import com.bf.slow.api.impl.UserInfoImpl;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.bf.slow.dao")
@EnableDubbo(scanBasePackages = "com.bf.slow.api")
public class BfUserServiceApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(BfUserServiceApplication.class, args);
    }

    @Autowired
    UserInfoImpl userInfo;

    @Bean
    public ApplicationRunner runner(){
        return args -> logger.info("S: "+ userInfo.getById("1"));
    }
}
