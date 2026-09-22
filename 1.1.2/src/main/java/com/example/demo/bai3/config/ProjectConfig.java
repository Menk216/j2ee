package com.example.demo.bai3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan(basePackages = {"com.example.demo.bai3.implementation", "com.example.demo.bai3.services"}) 
@ComponentScan(basePackageClasses = {com.example.demo.bai3.beans.Vehicle.class, com.example.demo.bai3.beans.Person.class}) 
public class ProjectConfig { 
}
