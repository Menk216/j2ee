package com.example.demo.bai3.implementation;

import com.example.demo.bai3.interfaces.Tyres;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component 
@Primary 
public class MichelinTyres implements Tyres { 
    public String rotate(){ 
        return "Vehicle moving with Michelin tyres"; 
    } 
}
