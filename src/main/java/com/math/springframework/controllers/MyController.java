package com.math.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getGreeting(){

        return "Hello World!";
    }
}
