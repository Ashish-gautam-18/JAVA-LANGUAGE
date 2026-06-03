package com.oop.miscellaneous;

public class ThisKeyword3 {
    
	ThisKeyword3(){
		System.out.println("this is constructor ....");
	}
	ThisKeyword3(int a){
		
		 this();
		     // if you will not use this(); then default cunstructor will not excute
		System.out.println("this is para cunstructor"+ a);
	}
	
	public static void main(String[] args) {
		ThisKeyword3 k3 = new ThisKeyword3(2);
		
	}
	
}
