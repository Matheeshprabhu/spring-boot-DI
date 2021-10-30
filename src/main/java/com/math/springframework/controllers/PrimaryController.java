package com.math.springframework.controllers;

import com.math.springframework.services.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final Greeting greeting;

    public PrimaryController(Greeting greeting) {
        this.greeting = greeting;
    }

    public String getGreeting(){
        return greeting.getGreeting();
    }
}
