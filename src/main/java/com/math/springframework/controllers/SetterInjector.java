package com.math.springframework.controllers;

import com.math.springframework.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjector {

    private Greeting greeting;

    @Autowired
    public void SetGreeting(@Qualifier("setterGreetingService")Greeting greeting){
        this.greeting = greeting;
    }

    public String getGreeting(){
        return greeting.getGreeting();
    }
}
