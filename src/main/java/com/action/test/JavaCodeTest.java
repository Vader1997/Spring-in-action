package com.action.test;

import com.action.config.JavaCodeConfig;
import com.action.service.JavaCodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaCodeConfig.class)
public class JavaCodeTest {
    @Autowired
    JavaCodeService javaCodeService;
    @Test
    public void test(){
        javaCodeService.show();
    }
}
