package com.math.springframework.controllers;

import com.math.springframework.services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjector {

    private final Greeting greeting;

    public ConstructorInjector(@Qualifier("constructorGreetingService") Greeting greeting){
        this.greeting = greeting;
    }

    public String getGreeting(){
        return greeting.getGreeting();
    }
}
