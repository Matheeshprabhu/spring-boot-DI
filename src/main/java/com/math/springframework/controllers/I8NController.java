package com.math.springframework.controllers;

import com.math.springframework.services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I8NController {

    public final Greeting greeting;

    public I8NController(@Qualifier("i8NGreeting") Greeting greeting) {
        this.greeting = greeting;
    }

    public String getGreeting(){
        return greeting.getGreeting();
    }
}
