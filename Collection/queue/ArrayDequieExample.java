package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequieExample {

	public static void main(String[] args) {
		
		Deque<String> name=new ArrayDeque<>();
             
	     name.addLast("anni");
	     name.addFirst("Babu");
	     name.add("hero");
	     
	     System.out.println(name);
	     System.out.println(name.removeFirst());
	     System.out.println(name);
	}
}
