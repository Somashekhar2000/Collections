package com.uis.exception_lab;

import com.uis.exception_lab.exception.InsufficientFundsException;

public class ATM {

	public double getCardBalance(Card card) {
		if (card.getAccountNumber() == null || card.getAccountNumber().trim().isBlank()
				|| card.getAccountNumber().trim().length() > 16) {
			throw new IllegalArgumentException("Invalid Account Number");
		}else {
			return card.getBalance();
		}
		
	}
	
	public Card withdraw(Card card, double amount) throws InsufficientFundsException {
		if (card.getAccountNumber() == null || card.getAccountNumber().trim().isBlank()
				|| card.getAccountNumber().trim().length() > 16) {
			throw new IllegalArgumentException("Invalid Account Number");
		} else if (card.getBalance() <= 0) {
			throw new InsufficientFundsException("Yogyata Prakar withdraw maado nimm aaai !!!");
		} else if (amount <= 0) {
			throw new IllegalArgumentException("Requested amount must be greater than 0 !!");
		} else {
			if (card.getBalance() < amount) {
				System.out.println("Requested amount = "+amount);
				System.out.println("Your current card balance = "+getCardBalance(card));
				throw new InsufficientFundsException("Insufficient Funds, kindly deposit soon");
			}
		}

		card.setBalance(card.getBalance() - amount);
		
		System.out.println("Hurrey !! The amount " + amount + " has been debited from " + card.getAccountNumber()
				+ " successfully !!\nCurrent Balance = " + card.getBalance());
		return card;
	}
}
