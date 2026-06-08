package com.oop.cunstructor;

public class DefaultDemo {
 
	   int a; 
	   String s;
	   boolean c ;
	   public void disp() {
		   System.out.println(a +"\n"+""+s+"\n"+""+c);
	   }
	     DefaultDemo(){
	    	a=10;
	    	s="ashish"; 
	    	c=true;
	    	
	     }
	
	public static void main(String[] args) {
		DefaultDemo r = new DefaultDemo();
         r.disp();
	}

}
