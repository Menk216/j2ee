package com.example.demo.duan1_1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {
    @Bean
    public GreetingService greetingService() {
        GreetingService service = new GreetingService();
        service.setMessage("Hello from Spring Container!");
        return service;
    }
}
