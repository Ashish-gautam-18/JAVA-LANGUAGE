package com.iterable.map;



import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
             // 1. HashMap: No guaranteed order, very fast
        Map<String, Integer> hashMap = new HashMap<>();

        
        String[] keys = {"kallu ", "baba", "gone"};
        int[] values = {10, 50, 30};

        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], values[i]);
        }

        System.out.println("HashMap (Unordered): " + hashMap);
        
              // Practice: Updating a Key
        if (hashMap.containsKey("baba")) {
            int babaValue = hashMap.remove("baba"); // Removes "baba", returns 50
            hashMap.put("mumbai", babaValue);       // Adds "mumbai" with 50
        }     
        System.out.println(hashMap);


    }
}
