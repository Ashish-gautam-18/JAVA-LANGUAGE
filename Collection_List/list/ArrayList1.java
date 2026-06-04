
   
// list has duplicate value are allowed......... 

package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj=new ArrayList();
        obj.add(5);
        obj.add(4);
        obj.add(3);
        obj.add(4);
        obj.add(1);
       
      // obj.forEach( (n)-> { System.out.println(n); } );
        
//        Iterator itr = obj.iterator();
//        while (itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
//        
        
//        ListIterator itr1 = obj.listIterator();
//        while(itr1.hasPrevious()){
//        	System.out.println(itr1.next());
//  
//	}
        
        
        for (int i : obj) {
        	 System.out.println(i);
        }
}

}




















