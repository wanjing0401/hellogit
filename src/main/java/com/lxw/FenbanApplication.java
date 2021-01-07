package com.lxw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxw.mapper")
public class FenbanApplication {

    public static void main(String[] args) {
        System.out.println("11111");
        System.out.println("22222");
        System.out.println("32131");
        SpringApplication.run(FenbanApplication.class, args);
    }

}
