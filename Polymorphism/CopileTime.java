package com.oop.polymorphism;

           //OVERLOADING METHOD ( same method with different parameter )
public class CopileTime {

	  void add () {
		  int a=10;
		  int b=29;
		  int c=a+b;		  
		  System.out.println(c);
	  }
	  
	   int add (int x ,int y) {
		  int c;
		  c=x+y;
		  return c;
		  //System.out.println(c);
	       
	  }
      
	  void add (int x , double y) {
		  double c;
		  c=x+y;
		  System.out.println(c);
	  }
	  public static void main(String[] args) {
		  CopileTime a = new CopileTime ();
		   a.add();
		   
		  int add= a.add(1,2);
		  System.out.println(add);
		   
		  a.add(3,9.5);
		   
	}
}
