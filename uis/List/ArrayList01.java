package com.uis.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList a1 =new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		ArrayList b1 = new ArrayList();
		b1.add("Red");
		b1.add("Green");
		b1.add("Orange");
		b1.add("White");
		b1.add("Black");
						
/*
 * 1. WAP to create a new ArrayList, add some colours (String) and PRINT out the collection.
 */
	//o	ArrayList01.printingListElements(a1);
		
/*
 * 2. WAP to ITERATE through all elements & MULTIPLY BY 2 in an ArrayList.
 */
	//	ArrayList01.iteratingElements(a1);
						
/*
 * 3. WAP to insert an element into the ArrayList at the FIRST position.
 */
						
//		Object a2 = new Object();
//		a2 = "red";
//		ArrayList01.insertAnElementAt0(a1, a2);
		
/*
 * 4. WAP to RETRIEVE an element (at a SPECIFIED INDEX) from a given ArrayList.
 */
//		int index = 2;
//		ArrayList01.retriveAnElement(b1, index);
		
/*
 * 5. WAP to UPDATE SPECIFIC ELEMENT by given element.
 */
		Object o=new Object();
     	o="red";
		ArrayList01.updateSpecificElement(b1, o);
		
	}
	
	
	public static void printingListElements(List list) {
		System.out.println(list);
	}
	
	public static void iteratingElements(List list) {
		for(int i = 0 ; i < list.size() ; i++) {
			int num = (int)list.get(i);
			System.out.print(2*num+" ");
		}
		System.out.println();
	}
	
	public static void insertAnElementAt0(List list,Object o) {
		System.out.println(" Starting list:"+list);
		list.add(0, o);
		System.out.println("new list"+list);
	}
	
	public static void retriveAnElement(List list ,int index) {
		System.out.println(list.get(index));
	}

	public static void updateSpecificElement(List list ,Object o) {
		System.out.println(" initial list:"+list);
		list.set(2, o);
		System.out.println("final list :"+list);
	}

}
