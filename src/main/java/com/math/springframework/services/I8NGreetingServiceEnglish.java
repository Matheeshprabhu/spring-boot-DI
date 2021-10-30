package com.math.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i8NGreeting")
public class I8NGreetingServiceEnglish implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello World! - I8NGreeting - English";
    }
}
