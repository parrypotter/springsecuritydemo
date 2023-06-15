package com.example.springsecuritydemo2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/login.html")
    public String login(){
        return "login";
    }
}
