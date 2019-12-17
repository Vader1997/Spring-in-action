package com.spring.aop.service;

import org.springframework.stereotype.Component;

@Component
public class AspectService {
    public void show(){
        System.out.println("无参AspectService.show运行!");
    }

    public int show(int i){
        System.out.println("有参AspectService.show运行!参数:"+i);
        int a = 5/i;
        return a;
    }
}
