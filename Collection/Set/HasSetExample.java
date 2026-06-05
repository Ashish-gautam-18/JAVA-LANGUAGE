//                             SET

//           In Interface Set All Implemented Classes Duplicate Value Are Not Allow............

//            #--> HasSet insertion order not Presented......


package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		

		Set<String> value=new HashSet<>();
		
//		value.add(5);
//		value.add(1);
//		value.add(6);
//		value.add(5);
//		value.add(6);
//		value.add(7);                 // output---> 1 5 6 7
		
		value.add("Anish");
		value.add("jyoti");
		value.add("Rajnish");
		value.add("Priyanshu");
		value.add("Ankush");
		value.add("Seenu");
		System.out.println(value);
		
//		for(String num:value)
//		{
//			System.out.println(num);       		
//		}
		
		Iterator itr = value.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
                                       //output---> [Rajnish, Anish, Ankush, jyoti, Seenu, Priyanshu]
