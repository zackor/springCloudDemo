package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContorller {
    @Value("${user.name}")
   private String name;
    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}
