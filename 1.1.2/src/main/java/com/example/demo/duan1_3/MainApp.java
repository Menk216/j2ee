package com.example.demo.duan1_3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonBean bean1 = context.getBean(SingletonBean.class);
        SingletonBean bean2 = context.getBean(SingletonBean.class);
        System.out.println("bean1 == bean2 ? " + (bean1 == bean2));
    }
}
