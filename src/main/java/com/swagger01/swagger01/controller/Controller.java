package com.swagger01.swagger01.controller;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "welcome")
public class Controller {

    @GetMapping(value = "")
    public String welcome(){
        return "Benvenuto nel localhost 1234";

    }
}
