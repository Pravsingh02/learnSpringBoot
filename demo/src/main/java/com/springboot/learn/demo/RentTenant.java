package com.springboot.learn.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class RentTenant {
    public void pay() {
        System.out.println("Rent is Due : Paying...");
    }

}
