package com.example.demo.duan1_5;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message: " + message);
    }
}
