package com.iterable.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.*;

public class LinkedHasMapEx {
    public static void main(String[] args) {
       
              // 2. LinkedHashMap: Maintains insertion order of addition
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
    
        String[] keys = {"Anish", "Apple", "Eating"};
        int[] values = {10, 50, 30};
         
          // either we can put data in key value pair like this
//        linkedMap.put(10,"Anish");
//        linkedMap.put(50,"Apple");
//        linkedMap.put(30,"Eating");

        for (int i = 0; i < keys.length; i++) {  
            linkedMap.put(keys[i], values[i]);
          
        }
        System.out.println(linkedMap);
             
              
                    // Practice: Updating a value
        linkedMap.replace("Apple", 100);
                      // Replaces 50 with 100
        
        System.out.println("updated "+linkedMap.get("Apple"));
        System.out.println(linkedMap);
    }
}

