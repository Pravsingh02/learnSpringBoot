package com.springboot.learn.demo;

import com.springboot.learn.demo.implementation.EmailNotiService;
import com.springboot.learn.demo.implementation.SmsNotiService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
//	@Autowired  //-> This is field injection
	NotificationService notificationService;
	public DemoApplication(NotificationService notificationService)
	{
		this.notificationService = notificationService; // Constructor Injection
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
//		SmsNotiService smsNotiService = new SmsNotiService();
		notificationService.sendMessage("Sending message");
//		smsNotiService.sendMessage("sending message");
		// here for creating send message via sms i need to edit the line no.22 with SmsNotiService interface
		// Basically we are doing tight coupling here
		// For achieving loose coupling we are suppose to use
		// @Component above the concrete class whose bean we want to use
		//If i use @Componet in both the class it will give abmiguity error
		// But for fixing this we can use @Primary above the class whose bean we want to use

		//Field injection is not a recommended way for DI
		// Use Constructor Injection


	}
}
