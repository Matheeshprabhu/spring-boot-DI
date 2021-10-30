package com.math.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Qualifier takes precedence over Primary. If Qualifier is not given then it'll go to Primary
@Primary
@Service
public class PrimaryGreetingServiceService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello world from primary bean";
    }
}
