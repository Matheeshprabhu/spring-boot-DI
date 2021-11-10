package com.math.springframework.config;

import com.math.springframework.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean
    I8NGreetingServiceEnglish i8NGreeting(){
        return new I8NGreetingServiceEnglish();
    }

    @Profile({"JP","default"})
    @Bean("i8NGreeting")
    I8NGreetintServiceJapanese i8NGreetintServiceJapanese(){
        return new I8NGreetintServiceJapanese();
    }


}
