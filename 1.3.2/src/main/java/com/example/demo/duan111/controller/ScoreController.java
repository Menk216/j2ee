package com.example.demo.duan111.controller;

import com.example.demo.duan111.model.Score;
import com.example.demo.duan111.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class ScoreController {
    private final ScoreService scoreService;
    private int currentCaptcha = 0;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("/lookup111")
    public String displayForm(Model model) {
        currentCaptcha = new Random().nextInt(9000) + 1000; // 4 digit captcha
        model.addAttribute("captchaImage", currentCaptcha); // Mocked as text
        return "lookup111";
    }

    @PostMapping("/lookup111")
    public String lookup(@RequestParam String mssv, @RequestParam int captcha, Model model) {
        if (captcha != currentCaptcha) {
            model.addAttribute("error", "Invalid captcha");
            currentCaptcha = new Random().nextInt(9000) + 1000;
            model.addAttribute("captchaImage", currentCaptcha);
            return "lookup111";
        }
        Score score = scoreService.getScore(mssv);
        if (score == null) {
            model.addAttribute("error", "Student not found");
        } else {
            model.addAttribute("score", score);
        }
        currentCaptcha = new Random().nextInt(9000) + 1000;
        model.addAttribute("captchaImage", currentCaptcha);
        return "lookup111";
    }
}

