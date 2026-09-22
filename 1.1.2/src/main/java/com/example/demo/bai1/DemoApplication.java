package com.example.demo.bai1;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class DemoApplication { 
    public static void main(String[] args) { 
        try (var ctx = SpringApplication.run(DemoApplication.class, args)) { 
            System.out.println("Welcome to Spring Boot!"); 
            System.out.println("# Beans: " + ctx.getBeanDefinitionCount()); 
            var names = ctx.getBeanDefinitionNames(); 
            Arrays.sort(names); 
            Arrays.asList(names).forEach(System.out::println); 
        } 
    } 
}
