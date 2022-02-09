package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* @description: 1.整合mybatis-plus
 *                  1）导入依赖
 *
 *              2.引入模板引擎thymeleaf-stater 关闭缓存
 *               1）静态资源都放在static文件夹下就可以按照路径直接访问
 *               2）页面放在templates下，直接访问
 *                  SpringBoot默认会找index
* @param:   @param null 
* @return: null 
* @author Lixin 
* @date: 2021/9/13 10:09 
*/

@EnableFeignClients(basePackages = "com.atguigu.gulimall.product.feign")
@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
