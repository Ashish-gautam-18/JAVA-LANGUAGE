package com.oop.abstraction;

  abstract class Animal {
 
	 Animal(){
		 System.out.println("all animal..");
	 }
	 
	 public abstract void sound();
}

    class Dog extends Animal{
    	Dog(){
    		super();
    		
    	}
    	public void sound() {
    		System.out.println("Dog is Barking..");
    	}
    }
    
    class Lion extends Animal{
    	   Lion(){
    		super();
    		
    	}
    	public void sound() {
    		System.out.println("lion is roar..");
    	}
    }
    
    class Test{
    	public static void main(String[] args) {
			Dog d=new Dog();
			Lion l= new Lion();
			
			d.sound();
			l.sound();
		}
    }