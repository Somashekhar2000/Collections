package com.uis.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//1. WAP to create a new TreeSet, add some colours (string) and print out the TreeSet.
		TreeSet set1 = new TreeSet<>();
		
		set1.add("Red");
		set1.add("White");
		set1.add("Pink");
		set1.add("Yellow");
		set1.add("Black");
		set1.add("Green");
		
		System.out.println("Created new TreeSet : "+set1);
	}

}
