package com.math.springframework.services;

//@Profile("EN")
//@Service("i8NGreeting")
public class I8NGreetingServiceEnglish implements Greeting{

    @Override
    public String getGreeting() {
        return "Hello World! - I8NGreeting - English";
    }
}
