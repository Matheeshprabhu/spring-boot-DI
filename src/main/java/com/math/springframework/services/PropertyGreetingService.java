package com.math.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello World! - Property";
    }
}
