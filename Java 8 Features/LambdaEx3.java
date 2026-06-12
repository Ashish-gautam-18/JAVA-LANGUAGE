package com.java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaEx3 {


	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("aashihs", "anish", "priyanshu");
	        names.forEach(name -> System.out.println("Hello, " + name));
	    }
	}


