package com.atguigu.gulimall.product.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @program: gulimall
 * @description: Redisson配置
 * @author: XinLi
 * @create: 2022-01-25 14:48
 **/
@Configuration
public class MyRedissonConfig {

    @Bean(destroyMethod = "shutdown")
    public RedissonClient reissson() throws IOException{
        Config config = new Config();
        config.useSingleServer().setAddress("redis://120.77.38.112:6379");
        return Redisson.create(config);
    }
}
