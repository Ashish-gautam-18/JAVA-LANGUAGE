package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class LmbdaComprator {

	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("kalu", "lalu", "nanu");

	        names.sort((a, b) -> a.compareTo(b));
	        names.forEach(System.out::println);
	    }
	}


