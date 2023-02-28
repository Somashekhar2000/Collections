package com.uis.List2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPracticals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList a1 = new LinkedList();
/*
 * 1. WAP to append the specified element to the end of a LinkedList.
 */
		a1.add("Red");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		a1.add("Yellow");
		
		//System.out.println(a1);
		
/*
 * 2. WAP to iterate through all elements in a LinkedList.

 */
//		for(Object O : a1) {
//			System.out.println(O);
//		}
		
/*
 * 5. WAP to insert the specified element at the specified position in the LinkedList
 */
		LinkedListPracticals.insertElementAtSpecifiedPosition(a1);
		
	}
	
	public static void insertElementAtSpecifiedPosition(List list) {
		list.add(3, "Brown");
		System.out.println(list);
	}
	
	

}
