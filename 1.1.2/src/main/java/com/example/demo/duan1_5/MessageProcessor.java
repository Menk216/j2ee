package com.example.demo.duan1_5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
    private final MessageService messageService;

    @Autowired
    public MessageProcessor(@Qualifier("smsService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
