package com.java8features;


public class LambdaExample {

    public static void main(String[] args) {
     
        Greeting greeting = () -> System.out.println("Hello, world!");
        
        greeting.sayHello();
    }
}
