package com.springboot.learn.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
//    @Scope("prototype") New Instance everytime, useful for stateful object
//    @Scope("request") // One Instance per http request,  useful for web apps
//    @Scope("application") // One per servletContext, seful for global Config
//    @Scope("session") // One per user session, use for shopping cart
    public PaymentService paymentService()
    {
        return new PaymentService();
    }
}
