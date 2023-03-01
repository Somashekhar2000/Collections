package com.uis.List2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPracticals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList a1 = new LinkedList();
		LinkedList a2 = new LinkedList();
/*
 * 1. WAP to append the specified element to the end of a LinkedList.
 */
		a1.add("Red");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		a1.add("Yellow");
		
		a2.add("Red");
		a2.add("Green");
		a2.add("Black");
		a2.add("White");
		a2.add("Pink");
		a2.add("Yellow");
		
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
//		LinkedListPracticals.insertElementAtEnd(a1);
		
/*
 * 9. WAP to insert some elements at the specified position into a LinkedList.
 */
//		LinkedListPracticals.insertSomeElementsAtGivenIndex(a1);
		
/*
 * 10.WAP to get the first and last elements in a LinkedList.
 */
//		LinkedListPracticals.getFirstAndLastElements(a1);
		
/*
 * 11.WAP to display the elements and their positions in a LinkedList.
 */
//		LinkedListPracticals.getElementAndIndexNumber(a1);
		
/*
 * 12.WAP to remove a specified element from a LinkedList
 */
		//LinkedListPracticals.removingSpecifiedElement(a1);
		
/*
 * 13.WAP to remove the first and last element from a LinkedList.
 */
//		LinkedListPracticals.removingFirstAndLast(a1);
		
/*
 * 14.WAP to remove all the elements from a LinkedList.
 */
//		LinkedListPracticals.removingAllElements(a1);
		
		
/*
 * 17. WAP to join two LinkedLists.
 */
//		LinkedList a2 = a1;
//		LinkedListPracticals.joing2LinkedLists(a1,a2);
	
/*
 * 19. WAP to remove and return the first element of a LinkedList
 */
//		String s = LinkedListPracticals.removeAndReturnFirstElemenet(a1);
//		System.out.println("Removed First Element : "+s);
		
/*
 * 20. WAP to retrieve but does not remove, the first element of a LinkedList.
 */
//		LinkedListPracticals.retrieveFirstElement(a1);
		
/*
 * 21. WAP to retrieve but does not remove, the last element of a LinkedList.
 */
//		LinkedListPracticals.retrieveLastElement(a1);
		
/*
 * 22. WAP to check if a particular element exists in a LinkedList.
 */
//		LinkedListPracticals.containsElemenet(a1);
		
/*
 * 23. WAP to convert a LinkedList to ArrayList
 */
//		LinkedListPracticals.convertingLinkedListToArrayList(a1);
		
/*
 * 24. WAP to compare two LinkedLists.
 */
//		LinkedListPracticals.comparing2LinkedLists(a1,a2);
		
/*
 * * 25. WAP to test if a LinkedList is empty or not.
 */
		LinkedListPracticals.isEmptyOrNot(a1);
				
		
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
	
	public static void insertSomeElementsAtGivenIndex(LinkedList list) {
		System.out.println("Original list :"+list);
		LinkedList a2 = new LinkedList<>();
		a2.add("Parrot Green");
		a2.add("Peach");
		list.addAll(1, a2);
		System.out.println("Added list :"+list);
	}
	
	public static void getFirstAndLastElements(LinkedList list) {
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
	
	public static void getElementAndIndexNumber(LinkedList list) {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("Element at Index "+i+" : "+list.get(i));
		}
	}
	
	public static void removingSpecifiedElement(LinkedList list) {
		System.out.println("Original list :"+list);
		list.remove(2);
		System.out.println("Added list :"+list);
	}
	
	public static void removingFirstAndLast(LinkedList list) {
		System.out.println("Original list :"+list);
		list.removeFirst();
		list.removeLast();
		System.out.println("Added list :"+list);
	}
	
	public static void removingAllElements(LinkedList list) {
		System.out.println("Original list :"+list);
		list.clear();
		System.out.println("Added list :"+list);
	}
	
	public static String removeAndReturnFirstElemenet(LinkedList<String> list1) {
		System.out.println("Original list :"+list1);
		return list1.pop();
	}
	
	public static void retrieveFirstElement(LinkedList list) {
		System.out.println("Original list :"+list);
		System.out.println("Retrieved First Element : "+list.peekFirst());
		System.out.println("Original list :"+list);
	}
	
	public static void retrieveLastElement(LinkedList list) {
		System.out.println("Original list :"+list);
		System.out.println("Retrieved Last Element : "+list.peekLast());
		System.out.println("Original list :"+list);
	}
	
	public static void containsElemenet(LinkedList list) {
		System.out.println("Original list :"+list);
		if(list.contains("Black")) {
			System.out.println("Colour found");
		}else {
			System.out.println("Colour not found");
		}
	}
	
	public static void convertingLinkedListToArrayList(LinkedList list1) {
		System.out.println("Linked List : "+list1);
		ArrayList list2 = new ArrayList<>(list1);
		System.out.println("Array List : "+list2);
	}
	
	public static void comparing2LinkedLists(LinkedList list1,LinkedList list2) {
			String s = null;
			for(int i = 0 ; i < list1.size() ; i++) {
				for(int j = 0 ;j < list2.size() ; j++) {
					 s = (list1.get(i).equals(list2.get(j))?"yes":"no");
					 if(s=="yes") {
						 break;
					 }
				}
				System.out.println(s);
			}
	}
	
	public static void isEmptyOrNot(LinkedList list) {
		System.out.println(list);
		if(list.isEmpty()) {
			System.out.println("input is already empty");
		}else {
			list.removeAll(list);
			System.out.println("after removing : "+list);
		}
	}
	
}
