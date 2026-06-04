package com.collection.list;

import java.util.Vector;

public class VectorEx3 {
public static void main(String[] args) {
	
	
	Vector<String> objs = new Vector<String>(3);
	                                 //Initial Capacity (3)
	System.out.println(objs.capacity()); 
	                              //3
	objs.add("ratan");
	objs.add("anu");
	objs.add("sravya");
	objs.add("naresh");  // add four element 
	System.out.println(objs.capacity()); //6
	
	       //objs.add("ratan"); → (Size: 1, Capacity: 3)
	       //objs.add("anu"); → (Size: 2, Capacity: 3)
//DRY RUN	   //objs.add("sravya"); → (Size: 3, Capacity: 3) — Vector is now full.
	       //objs.add("naresh"); → You are trying to add a 4th item. The Vector must grow.
	       //                        Since no increment was set, it doubles: 3 × 2 = 6.

}
}
