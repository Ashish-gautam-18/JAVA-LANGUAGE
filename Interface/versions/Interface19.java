package com.oop.new_interface.versions;

public interface Interface19 {

	   private void add(int x ,int y) {
		   
		   System.out.println(x+y);
		   System.out.println("this is interface private feture..");
    }
}

class B1 implements Interface19 {
	
	void sub(int x , int y) {
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		B1 b = new B1();
		 //b.add(2,4);
		        // Error will come  beacouse private members will not implements
		        //The method add(int, int) is undefined for the type B1
		 b.sub(7, 4);
	}
}


