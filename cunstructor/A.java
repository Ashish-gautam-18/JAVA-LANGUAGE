package com.oop.cunstructor;


// this class is constructor Overloading;

public class A {
  int a; double b; String c;
  A(){
	   a=10;
   b=89.90;
   c="Ashish";
  // System.out.println(a+"\n"+b+"\n"+c);
  }
  
  A(int x){
	   a=x;
  }
  
  A(double y ,String z){
	   b=y;
	   c=z;		   
  }

public static void main(String[] args) {
	 A r = new A(); 
	 A r2 = new A(10);
	 A r3 = new A(20.20,"anish");
	 
    System.out.println(r.a +"   "+ r.b+"   "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+"    "+r3.c);
}

}

