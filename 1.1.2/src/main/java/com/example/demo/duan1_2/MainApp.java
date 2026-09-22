package com.example.demo.duan1_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        PrototypeBean bean2 = context.getBean(PrototypeBean.class);
        System.out.println("bean1 == bean2 ? " + (bean1 == bean2));
    }
}
