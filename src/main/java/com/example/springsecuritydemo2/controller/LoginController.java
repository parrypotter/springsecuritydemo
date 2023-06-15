package com.example.springsecuritydemo2.controller;

import com.example.springsecuritydemo2.security.valication.UserLogin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserDetailsService userDetailsService;


    @PostMapping("/user")
    public void login(@Valid @RequestBody UserLogin userLogin){
        UserDetails details = userDetailsService.loadUserByUsername(userLogin.getUsername());
        log.info(details.getUsername());
    }
}
