package com.example.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class StartController {

    @GetMapping
    public String sendHello(){
        return "Hello Docker";
    }
}
