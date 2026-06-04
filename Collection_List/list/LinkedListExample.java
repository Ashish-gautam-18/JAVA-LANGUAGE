package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		

		LinkedList<String> name =new LinkedList<>();
		name.add("Ash");
		name.add("Kittu");
		name.add("Shweta");
         System.out.println(name);
         
//         name.addLast("Aman");
//         System.out.println(name);
//         
//         name.addFirst("kranti");
//         System.out.println(name);
//         
//         name.add(2,"jai Hind");
//         System.out.println(name);
//         
//          for(String arr:name) {
//         	 System.out.println(arr);
//          }
//         
//         name.removeFirst();
//         System.out.println(name);
//         
//         name.removeLast();
//         System.out.println(name);
         
//       Iterator itr = name.iterator();
//       while (itr.hasNext()) {
//       	System.out.println(itr.next());
//       }
       
     ListIterator itr1 = name.listIterator();
     while (itr1.hasPrevious()) {
     	System.out.println(itr1.next());
     }

      
	}

}
