package com.math.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello World! - Setter";
    }
}
