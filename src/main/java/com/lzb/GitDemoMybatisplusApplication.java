package com.lzb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.lzb.dao")
@ComponentScan("com.lzb")
public class GitDemoMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoMybatisplusApplication.class, args);
    }

}
