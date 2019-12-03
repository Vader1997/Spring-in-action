package com.action.test;

import com.action.config.AutoConfig;
import com.action.service.AutoService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class AutoTest {
    @Autowired
    AutoService autoService;

    @Test
    public void test(){
        autoService.show();
    }
}
