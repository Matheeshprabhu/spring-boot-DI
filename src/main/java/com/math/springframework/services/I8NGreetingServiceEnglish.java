package com.math.springframework.services;

import com.math.springframework.repositories.EnglishGreetingRepository;

//@Profile("EN")
//@Service("i8NGreeting")
public class I8NGreetingServiceEnglish implements Greeting{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I8NGreetingServiceEnglish(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String getGreeting() {
        return "Hello World! - I8NGreeting - English";
    }
}
