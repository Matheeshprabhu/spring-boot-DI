package com.math.springframework.config;

import com.math.springframework.prop.Property;
import com.math.springframework.repositories.EnglishGreetingRepositoryImpl;
import com.math.springframework.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    Property property(@Value("${math.username}") String name,
                      @Value("${math.password}")  String password,
                      @Value("${math.permission}")  String permission){
        Property property = new Property();
        property.setName(name);
        property.setPassword(password);
        property.setPermission(permission);

        return property;
    }
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
    I8NGreetingServiceEnglish i8NGreeting(EnglishGreetingRepositoryImpl englishGreetingRepository){
        return new I8NGreetingServiceEnglish(englishGreetingRepository);
    }

    @Profile({"JP","default"})
    @Bean("i8NGreeting")
    I8NGreetintServiceJapanese i8NGreetintServiceJapanese(){
        return new I8NGreetintServiceJapanese();
    }

    @Bean
    EnglishGreetingRepositoryImpl englishGreetingRepositoryImpl(){
        return new EnglishGreetingRepositoryImpl();
    }


}
