package com.collection.queue;

import java.util.*;

public class QueueEx1 {
    public static void main(String[] args) {
                  // We use LinkedList because Queue is an interface
       Queue<String> obj1 = new LinkedList<>();
     
        obj1.offer("First");
        obj1.offer("Second");
        obj1.offer("Third");

        System.out.println("top or head of queue: " + obj1.peek());
                                            // "First"
       
        System.out.println(obj1.poll());
                                  // Removes "First"
       
        System.out.println("Now Queue element: " + obj1);     
                                       // [Second, Third]
        
        
        
 System.out.println("______________________________________________________");
 
 
        
        Queue<String> obj2 = new PriorityQueue<>();
            //add items and instead stores them based on their natural priority
            //(for Strings, this means alphabetical order) [3, 4].

        obj2.offer("ratan");
        obj2.offer("anu");
        obj2.offer("abc");
        obj2.offer("siva");

        System.out.println(obj2); 

    }
}
