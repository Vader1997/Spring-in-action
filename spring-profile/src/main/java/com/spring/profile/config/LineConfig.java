package com.spring.profile.config;

import com.spring.profile.service.LineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("line")
public class LineConfig {
    @Bean
    public LineService lineService(){
        return new LineService();
    }

}
