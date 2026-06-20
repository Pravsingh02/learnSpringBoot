package com.springboot.learn.demo.implementation;

import com.springboot.learn.demo.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SmsNotiService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("via Sms " +message);
    }
}
