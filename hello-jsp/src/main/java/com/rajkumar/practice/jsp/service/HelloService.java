package com.rajkumar.practice.jsp.service;

public class HelloService {

    public String greet(String name) {
        return "Hello " + (name.isBlank() ? "user" : name);
    }

}
