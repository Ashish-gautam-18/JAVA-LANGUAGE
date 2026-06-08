package com.oop.new_interface.versions;

public interface A {

	 void a1();
	 void a2();
	 default void a3() {
		 
	 }
	    
}

class B implements A{
	
	public void a1() {
		System.out.println("class b of a1 method..");
	}
	
	public void a2() {
		System.out.println("class b of a2 method..");
	}
}


class C implements A {
	
	public void a1() {
		System.out.println("class c of a1 method..");
	}
	
	public void a2() {
		System.out.println("class c of a2 method..");
	}
}
  
    class D implements A {
    	
    	public void a1() {
    		System.out.println("class d of a1 method..");
    	}
    	
    	public void a2() {
    		System.out.println("class d of a2 method..");
    	}
    	
    	
    	public static void main(String[] args) {
			
    		A b = new B();
			b.a1();
			b.a2();
    		
    		
    		A a = new C();
			a.a1();
			a.a2();
			
			A d = new D();
			d.a1();
			d.a2();
    	}
    } 	
			
			       //class b of a1 method..
			       //class b of a2 method..
			
			       //class c of a1 method..
			       //class c of a2 method..
			
			       //class d of a1 method..
			       //class d of a2 method..
			      
		















    