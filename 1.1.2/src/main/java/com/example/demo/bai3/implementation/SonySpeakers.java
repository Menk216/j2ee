package com.example.demo.bai3.implementation;

import com.example.demo.bai3.interfaces.Speakers;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component 
@Primary 
public class SonySpeakers implements Speakers { 
    public String makeSound(){ 
        return "Playing music with Sony speakers"; 
    } 
}
