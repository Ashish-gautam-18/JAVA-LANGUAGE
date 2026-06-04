package com.collection.list;

import java.util.Vector;

public class VectorEx2 {
public static void main(String[] args) {
	
	
	
	Vector<String> data = new Vector<String>(2,6);
	                           //Initial Capacity (2)
	                           //Capacity Increment (6)
	
	System.out.println(data.capacity());  
	
	data.add("ratan");
	
	data.add("anu");  // here Slot 2 is filled. The Vector is now 100% full. Capacity is still 2
	
	data.add("sravya");	
	
	            //You are trying to add a 3rd item, but there are only 2 slots.
	            //The Vector looks at your Capacity Increment (6).
	            //It adds 6 new slots to the current capacity: 2 (original) + 6 (increment) = 8
	
	System.out.println(data.capacity()); 
                                 // 8
	
}
	

}
