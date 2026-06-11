package com.oop.polymorphism;
          
          //OVERRIDING METHOD ( super class and sub class of method and parameter both are same )
public class RunTime {

	 void drow () {
		 System.out.println("what types of drow..");
	 }
	 
}
   class Square extends RunTime{
	    void drow () {
	    	super.drow();
	    	System.out.println("ohh.. square shape will drow..");
	    }
	   
   }
   class Demo {
	   public static void main(String[] args) {
		   RunTime r= new Square();
	    	r.drow();
	    	  //  what types of drow..
	    	  //  ohh.. square shape will drow..
		}
   }
