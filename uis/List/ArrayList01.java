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
					ArrayList01.printingListElements(a1);
	System.out.println("---The End---");
	
	}
	public static void printingListElements(List list) {
		System.out.println(list);
	}
}
