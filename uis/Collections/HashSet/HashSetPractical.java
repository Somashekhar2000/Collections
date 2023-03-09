package com.uis.Collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetPractical 
{

	public static void main(String[] args) 
	{
		HashSet a1 = new HashSet<>();
		
//1. WAP to append the specified element to the end of a HashSet.
		
		a1.add("Red");
		a1.add("blue");
		a1.add("black");
		a1.add("green");
		a1.add("white");
		
//2. WAP to iterate through all elements in a HashSet.
		//HashSetPractical.iteratorHashSet(a1);
		
//3. WAP to get the number of elements in a HashSet.
		//System.out.println("get numnber of elements : "+a1.size());

//5. WAP to test a HashSet is empty or not.
		//System.err.println("Hashset is Empty : "+a1.isEmpty());
		
//4. WAP to empty the HashSet.
//		a1.clear();
//		System.out.println(a1);
		
//6. WAP to clone a HashSet to another HashSet.
//		System.out.println("original hashset : "+a1);
//		System.out.println("cloned hashset : "+a1.clone());
		
//7. WAP to convert a HashSet to an array.
//		ArrayList s = new ArrayList<>(a1);
//		System.out.println("ArrayList : "+s);
		
//8. WAP to convert a HashSet to a TreeSet.
//		TreeSet t = new TreeSet<>(a1);
//		System.out.println("treeset : "+t);
		
//10. WAP to compare two HashSet.
		HashSet s1 = new HashSet<>();
		s1.add("Red");
		s1.add("blue");
		s1.add("black");
		s1.add("green");
		s1.add("white");
		
	//	System.out.println("comparing 2 hashset : "+a1.containsAll(s1));
		
//11. WAP to compare two sets and retain elements which are same on	both sets.
		compareRetain(a1, s1);
		
	}
	
	public static void iteratorHashSet(HashSet a1)
	{
		Iterator t1 = a1.iterator();
		System.out.print("[");
		while(t1.hasNext()) 
		{
			System.out.print(t1.next()+",");
		}
		System.out.println("]");
	}
	
	

	public static void compareRetain(HashSet a1,HashSet a2) 
	{
		System.out.println(a1.containsAll(a2));
		System.out.println(a1.equals(a2));
	}
}