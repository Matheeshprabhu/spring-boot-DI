package com.math.springframework.controllers;

import com.math.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjector {

    @Qualifier("propertyGreetingServiceService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.getGreeting();
    }

}
