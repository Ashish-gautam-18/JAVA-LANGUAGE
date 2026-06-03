
              // super veriable

//package com.oop.miscellaneous;
//
//public class SuperClass {
//     
//    	 int a=12; 
//     
//	   
//}
//
//class Demo1 extends SuperClass{
//	int a=20;
//	void show() {
//		System.out.println(a);
//		                  // 20
//		System.out.println(super.a);
//		                   //12
//	}
//	public static void main(String[] args) {
//		Demo1 d =new Demo1();
//		 d.show();
//	}
//	
//}







                       //  super method
  
//
//package com.oop.miscellaneous;
//
//public class SuperClass {
//      
//	void show() {
//		System.out.println("hello super class");
//	}
//    	     
//	   
//}
//
//class Demo1 extends SuperClass{
//	
//	void show() {
//		System.out.println("hello sub class ");
//		
//		super.show();
//		    //  hello super class
//	}
//	public static void main(String[] args) {
//		Demo1 d =new Demo1();
//		 d.show();
//	}
//	
//}
//






                   // super constructor


package com.oop.miscellaneous;

public class SuperClass {
      
	SuperClass() {
		
		System.out.println("hello superclass constructor");
	}
    	     
	   
}

class Demo1 extends SuperClass{
	
	  Demo1() {
		  super();
		      // if you will now mention this super cunstructer then by default add while java compiler execute  
		System.out.println("hello sub class ");
	
	}
	public static void main(String[] args) {
		Demo1 d =new Demo1();
		
		        //  hello superclass constructor
		        //  hello sub class 

		 
	}
	
}


