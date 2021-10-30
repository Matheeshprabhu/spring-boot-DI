package com.math.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello World! - Property";
    }
}
