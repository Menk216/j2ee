package com.example.demo.bai3.implementation;

import com.example.demo.bai3.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component 
public class BridgeStoneTyres implements Tyres { 
    public String rotate(){ 
        return "Vehicle moving with BridgeStone tyres"; 
    } 
}
