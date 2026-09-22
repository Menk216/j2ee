package com.example.demo.duan1_5;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS message: " + message);
    }
}
