package com.example.demo.duan15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootDockerDemoApplication.class);
		// Ngăn Spring Boot khởi chạy Tomcat Web Server ở cổng 8080
		app.setWebApplicationType(WebApplicationType.NONE); 
		var context = app.run(args);
		
		System.out.println("calling pizzaController.getPizza()");
		PizzaController pizzaController = context.getBean(PizzaController.class);
		String message = pizzaController.getPizza();
		System.out.println(message);
	}
}
