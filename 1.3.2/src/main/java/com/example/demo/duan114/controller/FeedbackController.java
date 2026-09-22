package com.example.demo.duan114.controller;

import com.example.demo.duan114.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {
    @GetMapping("/feedback")
    public String displayFeedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/feedback")
    public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {
        model.addAttribute("message", "Thank you " + feedback.getName() + " for your feedback!");
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }
}

