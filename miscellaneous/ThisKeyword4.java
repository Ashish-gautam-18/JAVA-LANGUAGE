package com.oop.miscellaneous;

public class ThisKeyword4 {

	ThisKeyword4 (){
		
		this(10);
		
	}
	ThisKeyword4(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeyword4 k4 = new ThisKeyword4 ();
	}
}
