package com.springboot.learn.demo.implementation;

import com.springboot.learn.demo.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotiService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("via Email " + message);
    }
}
