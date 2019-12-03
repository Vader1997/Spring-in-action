package com.action.config;

import com.action.service.JavaCodeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaCodeConfig {

    @Bean
    public JavaCodeService javaCodeService(){
        return new JavaCodeService();
    }
}
