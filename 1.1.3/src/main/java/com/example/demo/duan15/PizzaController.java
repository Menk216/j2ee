package com.example.demo.duan15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
        System.out.println("inside PizzaController constructor");
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }
}

