package com.example.demo.duan113.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CvController {
    @GetMapping("/cv")
    public String displayCv() {
        return "cv";
    }
}

