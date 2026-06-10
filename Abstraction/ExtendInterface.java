package com.oop.abstraction;

public interface ExtendInterface {
 
	     void add();
	     
}

interface Raj extends ExtendInterface {
	
	void sub();
}


class Ashish implements Raj {
	   
	   public void add() {
		   int a=10;
		   int b=20;
		   int c=a+b;
		   System.out.println(c +"additon of a + b");
	   }
	   public void sub() {
		   int a=20;
		   int b=10;
		   int c=a-b;
		   System.out.println(c +"subraction of a - b");
	   }
	   
	   public static void main(String[] args) {
		Ashish a = new Ashish();
		  a.add();
		  a.sub();
	}
}