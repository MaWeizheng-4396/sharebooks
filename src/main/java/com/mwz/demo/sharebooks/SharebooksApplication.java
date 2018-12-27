package com.mwz.demo.sharebooks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mwz.demo.sharebooks.dao")
public class SharebooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharebooksApplication.class, args);
    }
}
