package com.oauth.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Mycontroller {
    @GetMapping("/")
    public String home()
    {
        return "Home";
    }
    @GetMapping("/secure")
    public String securehome()
    {
        return "secure home!";
    }
}
