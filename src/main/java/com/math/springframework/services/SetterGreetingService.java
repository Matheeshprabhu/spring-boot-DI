package com.math.springframework.services;

public class SetterGreetingService implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello World! - Setter";
    }
}
