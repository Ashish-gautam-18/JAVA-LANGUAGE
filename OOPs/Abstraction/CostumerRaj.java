package com.oop.abstraction;

       // why interface veriable is public + static + final
public interface CostumerRaj {
    
	int amt=5; // public+Static+final
   void purchase();
}

  class sellerRaju implements CostumerRaj{
	  @Override
	  public void purchase () {
		  int amt=7;
		  System.out.println("raj need only  "+amt+" kg rice");
		  
	  }
  }
  
  class cheak {
	  public static void main(String[] args) {
		  CostumerRaj r =new sellerRaju();
		  
		  r.purchase();
		        // raj need only7kg rice
		 System.out.println(CostumerRaj.amt);
		                    //5
	}
  }