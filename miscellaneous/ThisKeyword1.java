package com.oop.miscellaneous;

public class ThisKeyword1 {
 
//	   public static void main(String[] args) {
//		   ThisKeyword1 k = new ThisKeyword1();
//		System.out.println(k);
//		                 // @515f550a 
//	}
//	   
//}
	
	
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisKeyword1 k = new ThisKeyword1();
		k.show();
		        // @515f550a
	}
}
