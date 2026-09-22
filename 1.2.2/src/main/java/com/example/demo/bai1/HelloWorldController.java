package com.example.demo.bai1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringBootVersion;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        var version = SpringBootVersion.getVersion();
        return String.format("Hello World, from Spring Boot %s!", version);
    }
}
