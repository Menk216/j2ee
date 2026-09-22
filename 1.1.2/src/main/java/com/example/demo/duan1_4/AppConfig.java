package com.example.demo.duan1_4;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.demo.duan1_4")
@PropertySource("classpath:duan1_4.properties")
public class AppConfig {
}
