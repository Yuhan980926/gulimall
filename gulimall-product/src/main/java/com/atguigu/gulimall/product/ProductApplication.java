package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @description: 1.整合mybatis-plus
 *                  1）导入依赖
* @param:   @param null 
* @return: null 
* @author Lixin 
* @date: 2021/9/13 10:09 
*/

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
