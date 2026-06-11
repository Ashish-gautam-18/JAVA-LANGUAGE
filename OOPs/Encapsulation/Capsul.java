package com.oop.encapsulation;

public class Capsul {

	private int value;
	
	public void setValue(int x) {
		value =x;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Capsul c = new Capsul ();
		
		
//		   c.value=100;
//		   System.out.println(c.value);
		   
		   
		    c.setValue(101);
		    System.out.println(c.getValue());
	}
}
