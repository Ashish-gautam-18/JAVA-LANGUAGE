package com.oop.abstraction;

public interface MultipleInheritenceInterface {
       
	   void show();
      //void Disp();
}

   interface inheritensemultiple {
	   void show();
	   
   }
   
   class Multiple implements MultipleInheritenceInterface , inheritensemultiple {
	  
//	   public void Disp() {
//	    	  System.out.println("inheritense multiple");
//	      }
	   
	      public void show() {
	    	  System.out.println("interface : inheritense multiple and MultipleInheritenceInterface");
	      }
	      
	      public static void main(String[] args) {
	    	  Multiple m = new Multiple();
	    	    m.show();
	    	   //m.Disp();
		}
   }