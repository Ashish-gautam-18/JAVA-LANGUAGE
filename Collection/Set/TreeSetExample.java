
//            #TreeSet insertion order not presented

package com.collection.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {
		

	TreeSet<Integer> name=new TreeSet<Integer>();
		name.add(5);
		name.add(2);
		name.add(4);
		name.add(7);
		name.add(3);
		name.add(1);
		System.out.println(name);
        name.remove(4); // index no elment deleted
        
	TreeSet<String> name1=new TreeSet<String>();
		name1.add("ashish");
		name1.add("anish");
		name1.add("Rajnish");
		name1.add("Priayashu");
		
		Iterator itr=name1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		 
		
	}
	}
}
