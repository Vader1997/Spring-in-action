package com.spring.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Before("execution(* com.spring.aop.service.AspectService.show(..))")
    public void before(){
        System.out.println("前置通知");
    }

    @After("execution(* com.spring.aop.service.AspectService.show(..))")
    public void after(){
        System.out.println("后置通知");
    }

    //带参数的通知，可以接受被通知方法的参数
    @AfterReturning("execution(* com.spring.aop.service.AspectService.show(..))&& args(i)")
    public void afterReturning(int i){
        System.out.println("返回通知:"+i);
    }

    @AfterThrowing("execution(* com.spring.aop.service.AspectService.show(..))&& args(i)")
    public void afterThrowing(int i){
        System.out.println("发生异常！参数是:"+i);
    }
}
