package com.example.demo.bai2;

public interface Operation { 
    int apply(int lhs, int rhs); 
    boolean handles(char op); 
}
