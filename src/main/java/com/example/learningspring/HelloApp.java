package com.example.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        // Launch a Spring context
        var context = new AnnotationConfigApplicationContext(HelloConfig.class);

        // retrieving beans maneged by Spring
        System.out.println(context.getBean("hello")); // hello
    }
}
