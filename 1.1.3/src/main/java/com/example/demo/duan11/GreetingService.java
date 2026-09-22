package com.example.demo.duan11;

public class GreetingService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: " + message);
    }
}

