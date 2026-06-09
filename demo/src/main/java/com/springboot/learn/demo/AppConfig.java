package com.springboot.learn.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public RentTenant rent()
    {
        return new RentTenant();
    }
}
