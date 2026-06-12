package com.java8features;

import java.util.function.Predicate;

public class LambdaExample2 {

    public static void main(String[] args) {
        
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Is 5 even? " + isEven.test(5));
        System.out.println("Is 14 even? " + isEven.test(14));
    }
}
