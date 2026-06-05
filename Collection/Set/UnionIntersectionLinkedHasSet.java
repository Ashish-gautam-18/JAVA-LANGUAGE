package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Arrays;


public class UnionIntersectionLinkedHasSet {

	    public static void main(String[] args) {
	    	
	        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
	        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5, 6));
                         //The Constructor: LinkedHashSet has a special constructor that can take an existing Collection
	                     //(like the List we created above) as an argument.
//	          set1.add(1);
//	          set1.add(5);
//	          set1.add(7);
//	          set2.add(2);       // we can write this way and find union and intersecetion.
//	          set2.add(3);
//	          set2.add(7);
//	          set2.add(1);
//	        

	      
	        // Union (All unique elements from both)
	        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);
	        union.addAll(set2);
	        System.out.println("Union: " + union); // [1, 2, 3, 4, 5, 6]

	        // Intersection (Only common elements)
	        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);
	        //retainAll() --> Keeps only elements present in both sets (Intersection)
	        intersection.retainAll(set2);
	        System.out.println("Intersection: " + intersection); // [3, 4]
	    }
	}
