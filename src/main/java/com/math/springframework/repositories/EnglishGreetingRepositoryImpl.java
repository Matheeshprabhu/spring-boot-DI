package com.math.springframework.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    public String getGreeting(){
        return "Hello World - English!";
    }
}
