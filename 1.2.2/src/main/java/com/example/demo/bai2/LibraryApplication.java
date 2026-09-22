package com.example.demo.bai2;

import com.example.demo.bai2.repository.BookGenerator;
import com.example.demo.bai2.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
    
    @Bean
    public ApplicationRunner booksInitializer(BookService bookService) {
        return args -> {
            BookGenerator.all().forEach(bookService::create);
        };
    }
}



