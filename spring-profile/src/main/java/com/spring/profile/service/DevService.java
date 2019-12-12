package com.spring.profile.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DevService {
    public void show(){
        System.out.println("dev 环境");
    }
}
