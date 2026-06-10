package com.oop.inheritence;

public class HierarchicalDemo {

	    void show() {
	    	System.out.println("this is show method in super class.."); 
	    }
}

class Test2 extends HierarchicalDemo{
	  
	 void input() {
		 System.out.println("this is first sub class..");
	 }
}

class Test3 extends HierarchicalDemo{
	 void Demo() {
		 System.out.println("this is second sub class..");
	 }
}

class Test4 extends HierarchicalDemo{
	 void repo() {
		 System.out.println("this is third sub class..");
	 }
}
class Demo {
	public static void main(String[] args) {
		Test2 t2 =new Test2();
		t2.input();
		t2.show();
		
		Test3 t3 =new Test3();
		t3.Demo();
		t3.show();
		
		Test4 t4 =new Test4();
		t4.repo();
		t4.show();
		
		
	}
	
}








