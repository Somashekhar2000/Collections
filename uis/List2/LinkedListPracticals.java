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
		//LinkedListPracticals.insertElementAtSpecifiedPosition(a1);
		
/*
 * 6. WAP to insert elements into the LinkedList at the first and last position
 */
		//LinkedListPracticals.insertInFirstAndLast(a1);
		
/*
 * 7. WAP to insert the specified element at the front of a LinkedList.
 */
		//LinkedListPracticals.insertElementAtFront(a1);
		
/*
 * 8. WAP to insert the specified element at the end of a LinkedList
 */
		LinkedListPracticals.insertElementAtEnd(a1);
		
	}
	
	public static void insertElementAtSpecifiedPosition(List list) {
		System.out.println("Original list :"+list);
		list.add(3, "Brown");
		System.out.println("Added list :"+list);
	}
	
	public static void insertInFirstAndLast(LinkedList list) {
		System.out.println("Original list :"+list);
		list.addFirst("Sliver");
		list.addLast("Gold");
		System.out.println("Added list :"+list);
	}
	
	public static void insertElementAtFront(LinkedList list) {
		System.out.println("Original list :"+list);
		list.offerFirst("Purpole");
		System.out.println("Added list :"+list);
	}
	
	public static void insertElementAtEnd(LinkedList list) {
		System.out.println("Original list :"+list);
		list.offerLast("Grey");
		System.out.println("Added list :"+list);
	}

}
