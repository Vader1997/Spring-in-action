package com.spring.profile.test;

import com.spring.profile.config.DevConfig;
import com.spring.profile.config.LineConfig;
import com.spring.profile.service.DevService;
import com.spring.profile.service.LineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DevConfig.class)
@ActiveProfiles("dev")
public class DevTest {
    @Autowired
    DevService devService;
    @Test
    public void devShow(){
        devService.show();
    }
}
