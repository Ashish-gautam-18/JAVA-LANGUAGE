package com.oop.miscellaneous;

public class ThisKeyword2 {

	      int a ;
       
	      ThisKeyword2(int a){
	    	  
	    	this.a=a;
	    	  
	      }
	      void show () {
	    	  System.out.println(a);
	      }
	      
	      
	  public static void main(String[] args) {
	  	  ThisKeyword2 k = new ThisKeyword2(20);
	          k.show();
	      }
}

// jvm will get confused when intance and local veriable both are same 
// "this.a" is instance veriable and we know current object 