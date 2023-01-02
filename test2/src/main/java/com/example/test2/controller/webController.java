package com.example.test2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class webController {

    @GetMapping("/vue")
    public String vue() {
        return "vue/index";
    }
}
