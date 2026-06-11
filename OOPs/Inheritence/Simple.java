package com.oop.inheritence;

public class Simple {
	   int a; 
	   String b;
	   boolean c ;
	   
	   void show() {
		   a=10;
		   b="skf";
		   c=true;
		   
		   System.out.println(a+"\n"+b+"\n"+c);
	   }
	  
}
	   class B extends Simple{
		   public static void main(String[] args) {
			   Simple  b = new B();
			   b.show();
				System.out.println("Ashish Kumar Gautam");
			}
		  
	   }

