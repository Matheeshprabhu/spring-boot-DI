package com.math.springframework.services;

//Qualifier takes precedence over Primary. If Qualifier is not given then it'll go to Primary
//@Primary
//@Service
public class PrimaryGreetingService implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello world from primary bean";
    }
}
