package com.spring.profile.test;

import com.spring.profile.config.LineConfig;
import com.spring.profile.service.LineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LineConfig.class)
@ActiveProfiles("line")
public class LineTest {
    @Autowired
    LineService lineService;
    @Test
    public void show(){
        lineService.show();
    }
}
