package com.spring.aop.config;

import com.spring.aop.aspect.Audience;
import com.spring.aop.service.AspectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.spring.aop")
public class JavaCodeConfig {
//    @Bean
//    public Audience audience(){
//        return new Audience();
//    }

}
