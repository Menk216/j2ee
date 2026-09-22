package com.example.demo.duan1_4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppInfo info = context.getBean(AppInfo.class);
        info.printInfo();
    }
}
