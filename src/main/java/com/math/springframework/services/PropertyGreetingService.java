package com.math.springframework.services;

public class PropertyGreetingService implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello World! - Property";
    }
}
