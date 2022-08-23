package com.mchandu8.twelvefactorapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }
}
