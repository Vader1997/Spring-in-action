package com.spring.profile.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
@ComponentScan(basePackages = "com.spring.profile.service")
public class DevConfig {

}
