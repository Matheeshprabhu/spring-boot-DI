package com.math.springframework.services;

public class ConstructorGreetingService implements Greeting {

    @Override
    public String getGreeting() {
        return "Hello World! - Constructor";
    }
}
