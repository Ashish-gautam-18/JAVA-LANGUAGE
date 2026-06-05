package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HasSetEx2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Rajnish");
		al.add("Priyanshu");
		al.add("Ankush");
		al.add("Seenu");
		
		
		Set value=new HashSet(al);
		                  // here we contain arrylist in hashset object as prameter
		value.add("lallu");
		value.add("kallu");
		value.add("kekada");
		
		System.out.println(value);
		              //[Rajnish, Ankush, kekada, Seenu, Priyanshu, kallu, lallu]
	}
}
