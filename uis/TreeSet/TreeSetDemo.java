package com.uis.TreeSet;

import java.util.Iterator;
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
		
	//	System.out.println("Created new TreeSet : "+set1);
		
//2. WAP to iterate through all elements in a TreeSet.
//		TreeSetDemo.iteratingTreeSet(set1);
		
//3. WAP to add all the elements of a specified TreeSet to another TreeSet
		TreeSetDemo.addingtreeSetElmenetsTOAnotherTreeSet(set1);
		
	}
	
	public static void addingtreeSetElmenetsTOAnotherTreeSet (TreeSet set1) {
		System.out.println("TreeSet Set1 : "+set1);
		TreeSet set2 = set1;
		System.out.println("Added TreeSet set2 : "+set2);
	}
	
	public static void iteratingTreeSet(TreeSet set1) {
		Iterator t1 = set1.iterator();
		System.out.println("Printing elements using Iterator");
		System.out.print("[");
		while(t1.hasNext()) {
			System.out.print(t1.next()+",");
		}
		System.out.println("]");
	}
	
	
	

}
