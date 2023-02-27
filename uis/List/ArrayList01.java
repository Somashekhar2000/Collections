package com.uis.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
						ArrayList a1 =new ArrayList<>();
						a1.add(10);
						a1.add(20);
						a1.add(30);
						a1.add(40);
						a1.add(50);
						
/*
 * 1. WAP to create a new ArrayList, add some colours (String) and PRINT out the collection.
 */
	//	ArrayList01.printingListElements(a1);
		
/*
 * 2. WAP to ITERATE through all elements & MULTIPLY BY 2 in an ArrayList.
 */
		ArrayList01.iteratingElements(a1);
	}
	
	
	public static void printingListElements(List list) {
		System.out.println(list);
	}
	
	public static void iteratingElements(List list) {
		for(int i = 0 ; i < list.size() ; i++) {
			int num = (int)list.get(i);
			System.out.print(2*num+" ");
		}
	}
}
