package com.math.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements Greeting {

    @Override
    public String getGreeting() {
        return "Hello World! - Constructor";
    }
}
