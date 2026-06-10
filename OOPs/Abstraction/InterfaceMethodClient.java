package com.oop.abstraction;

public interface InterfaceMethodClient {

         void webDesign();
         void webDeveloper();
}
                    // RajTech is company name
  abstract class RajTech implements InterfaceMethodClient{
	  @Override 
	  public void webDesign() {
		   System.out.println(" RajTech Company : html and css to make a pages ..");
	  }	
		
	}
                    // after RajTech , babuTech company Handover all work 
  class babuTech extends RajTech{
	  @Override
		public void webDeveloper() {
       
		  System.out.println(" babuTech Company : javaScript and react to make dynamic website");
       }
	  
	  public static void main(String[] args) {
		babuTech b = new babuTech();
		  b.webDesign();
		  b.webDeveloper();
	}
 }
