package com.spring.aop.test;

import com.spring.aop.config.JavaCodeConfig;
import com.spring.aop.service.AspectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaCodeConfig.class)
public class AspectTest {
    @Autowired
    private AspectService aspectService;
    @Test
    public void show(){
        aspectService.show(0);
    }
}
