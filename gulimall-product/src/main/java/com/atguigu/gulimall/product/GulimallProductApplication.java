package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: GulimallProductApplication
 * @description: 启动类
 * @author: Jack.Myl
 * @date: 2023/01/14 20:22
 **/
@MapperScan("com.atguigu.gulimall.product.mapper")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
