package com.collection.list;


import java.util.*;

public class VectorEx1 {

	public static void main(String[] args) {
		
				
		Vector<String> objects = new Vector<String>();
		objects.add("ratan");
		objects.add("anu");
		objects.add("durga");
	
		System.out.println(objects.firstElement());
		System.out.println(objects);
		System.out.println(objects.capacity());
		                           // 10
		
		
		
System.out.println("*************************");
		

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("anu");
		Vector<String> v = new Vector<String>(al);
		v.add("ratan");
		System.out.println(v);
		
		
		
	}
}
