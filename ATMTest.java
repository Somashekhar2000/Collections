package com.uis.exception_lab;

import java.util.Scanner;

import com.uis.exception_lab.exception.InsufficientFundsException;

public class ATMTest {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ATM atm = new ATM();
		Card card = new Card("12341234", 1000.24);

		try {
			
			atm.withdraw(card, 5000);
			
		} catch (InsufficientFundsException e) {
			e.getMessage();
			System.out.println("Would you like to withdraw within withdrawal limit ? ");
			System.out.println("Yes");
			System.out.println("No");
			String answer = kb.next();
			if(answer.equalsIgnoreCase("yes")) {
				try {
					atm.withdraw(card, 500);
				} catch (InsufficientFundsException e1) {
					e1.printStackTrace();
				}
			}else {
				System.out.println("Thank you for Banking with us - Warm regards from UIS.");
				System.out.println("Today is a good today!!");
				System.exit(0);
			}
		}
		System.out.println("The End");
	}

}
