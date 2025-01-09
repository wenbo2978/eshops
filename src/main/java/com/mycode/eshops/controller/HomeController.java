package com.mycode.eshops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        System.out.println("hello");
        return "Welcome to the API!";
    }
}
