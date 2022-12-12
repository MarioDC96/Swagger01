package com.swagger01.swagger01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("")
    public String sayHello(){
        return "Benvenuto nel localhost 1234";
    }
}
