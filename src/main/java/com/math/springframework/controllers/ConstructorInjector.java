package com.math.springframework.controllers;

import com.math.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjector {

    private final GreetingService greetingService;

    public ConstructorInjector(@Qualifier("constructorGreetingServiceService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
