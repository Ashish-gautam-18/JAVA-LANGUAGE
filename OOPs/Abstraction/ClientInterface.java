package com.oop.abstraction;

import java.util.Scanner;

public interface ClientInterface {

	 void input();
	 void output();
}

class Raju implements ClientInterface{
	 String name;
	 double sal;
   
	 public void input() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Username..");
		 name=sc.nextLine();
		 System.out.println("Enter your Sallary..");
		 sal=sc.nextDouble();
	 }
	 
	 public void output() {
		 System.out.println(name +"\n"+ sal);
	    
	 }
	 
	 public static void main(String[] args) {
		 ClientInterface r = new Raju();
		 r.input();
		 r.output();
	}
 }
