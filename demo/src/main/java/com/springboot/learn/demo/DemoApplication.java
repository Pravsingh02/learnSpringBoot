package com.springboot.learn.demo;

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
	@Autowired
	RentTenant rent;
	// 1st way to create a bean
		// Spring Ioc does that by itself just add any annotation from below on the class whose object needs to be created
		// @Component
		//	@Service
		//	@Controller
		//	@Repository
		//	@RestController
		// Wherever Object needs to be Inject we use @Autowired Annotation example - line no. 15
	// 2nd way to create a bean
		// Using @Bean Annotation with the for telling how a bean should be created
		// (though it is managed and configured by Spring Ioc Only)
		// It should be done inside a class with @Configuration Annotation
		// Example : AppConfig.java file

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@PostConstruct
	public void ps(){
		System.out.println("After Using");
	}
	@PreDestroy
	public void pd()
	{
		System.out.println("Before destory");
	}

	@Override
	public void run(String... args) throws Exception {
		rent.pay();
	}


}
