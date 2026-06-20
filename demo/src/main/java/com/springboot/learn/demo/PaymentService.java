package com.springboot.learn.demo;

import org.springframework.stereotype.Controller;

@Controller
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

}
