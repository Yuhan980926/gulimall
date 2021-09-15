package com.atguigu.gulimall.gulimallgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: gulimall
 * @description: 网关跨域配置
 * @author: XinLi
 * @create: 2021-09-15 17:04
 **/
@Configuration
public class GulimallCorsConfiguration {

    /**
    * @description: springboot自带跨域filter 
    * @param:   @param  
    * @return: CorsWebFilter 
    * @author Lixin
    * @date: 2021/9/15 17:11 
    */
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //1.配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);

        return new CorsWebFilter(source);
    }
}
