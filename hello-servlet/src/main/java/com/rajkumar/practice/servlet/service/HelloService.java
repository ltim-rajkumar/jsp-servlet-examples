package com.rajkumar.practice.servlet.service;

public class HelloService {

    public String greet(String name) {
        return "Hello " + (name.isBlank() ? "user" : name);
    }

}
