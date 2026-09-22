package com.example.demo.duan1_5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        processor.processMessage("Hello, this is a test message!");
    }
}
