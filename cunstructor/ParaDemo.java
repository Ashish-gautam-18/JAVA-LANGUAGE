package com.oop.cunstructor;

public class ParaDemo {
             int x;int y;
           ParaDemo(int a,int b){
        	    x=a;
        	    y=b;
           }
           public void show() {
        	   System.out.println(x +y);
           }
           public static void main(String[] args) {
       		
     		  ParaDemo r = new ParaDemo(23,3);
     		  r.show();
     		} 
}


 