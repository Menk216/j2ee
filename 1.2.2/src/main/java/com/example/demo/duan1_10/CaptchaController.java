package com.example.demo.duan1_10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

@Controller
public class CaptchaController {
    private final Random random = new Random();

    @GetMapping("/captcha")
    public String showCaptcha(Model model) {
        int captchaId = random.nextInt(20) + 1;
        model.addAttribute("captchaUrl", "/captcha/captcha_" + captchaId + ".png");
        return "duan1_10/captcha";
    }
}
