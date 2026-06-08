package com.oop.cunstructor;

public class DemoPrivate {
          int a; double b; String c;
	       private DemoPrivate() {
	    	    a=10;
	    	    b=89.90;
	    	    c="Ashish";
	       
	    	    System.out.println(a+"\n"+b+"\n"+c);
	       }
	public static void main(String[] args) {
		DemoPrivate r = new DemoPrivate();
	}
	
}
   // we can't access another class 
//class B{
//	public static void main(String[] args) {
//		DemoPrivate r = new DemoPrivate();
//	}                            // Error
//}
