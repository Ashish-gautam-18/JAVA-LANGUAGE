package com.oop.inheritence;

 class MultiLevel {
        int a; int b;int c;
	void add() {
		
		 a=10;
		 b=20;
		 c=a+b;
		 System.out.println("Addition of a and b - "+ c);
	}

}
     class C extends MultiLevel {
    	
    	 void mul() {
    		 a=10;
    		 b=20;
    		 c=b*a;
    		 System.out.println(c +"is multiplication of a and b");
    	 }
    	 
	      
      }
      class D extends C {
     	
    	 void div() {
    		 a=10;
    		 b=20;
    		 c=a/b;
    		 System.out.println(c +"is multiplication of a and b");
    	 }   
      }

      class Test1{

	       public static void main(String[] args) {
   
	    	     D r = new D();
	    	       r.add();
	    	       r.mul();
	    	       r.div();   
                  }
	   
              }






















