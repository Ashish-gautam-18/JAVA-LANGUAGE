package com.oop.abstraction;

  abstract class Method {
	
	public abstract void Developer();
	//public abstract void rank();
	
}

  class HTML extends Method{
	
	 public void Developer() {
		  System.out.println("tim berners lee");
	  }
	  
  }
  
  class JAVA extends Method{
	  @Override
	  public void Developer() {
		  System.out.println("james goslin");
	  }
  }

  class Testt {
	  public static void main(String[] args) {
			HTML h= new HTML();
			JAVA j =new JAVA();
			h.Developer();
			j.Developer();
		}
  }