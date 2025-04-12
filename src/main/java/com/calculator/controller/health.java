package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class health {

    @GetMapping("message")
    public String getmessage(){
        return  "I am working fine :) ";
    }
}
