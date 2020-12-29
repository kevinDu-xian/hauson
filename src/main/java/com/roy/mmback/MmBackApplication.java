package com.roy.mmback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.roy.mmback.dao")
@SpringBootApplication
public class MmBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmBackApplication.class, args);
    }

}
