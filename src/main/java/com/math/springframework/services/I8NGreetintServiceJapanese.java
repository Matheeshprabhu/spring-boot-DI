package com.math.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"JP", "default"})
@Service("i8NGreeting")
public class I8NGreetintServiceJapanese implements Greeting {

    @Override
    public String getGreeting() {
        return "Hello World! - I8NGreeting - Japanese";
    }
}
