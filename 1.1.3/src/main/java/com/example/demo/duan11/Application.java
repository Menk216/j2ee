package com.example.demo.duan11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        greetingService.getMessage();
        ((AnnotationConfigApplicationContext) context).close();
    }
}

