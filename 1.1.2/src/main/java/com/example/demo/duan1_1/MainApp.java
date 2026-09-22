package com.example.demo.duan1_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        GreetingService service = context.getBean(GreetingService.class);
        System.out.println(service.getMessage());
    }
}
