package com.webapplication.example_18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/homeless")
    public String displayHomePage(){
        return "homeless.html";
    }
}
