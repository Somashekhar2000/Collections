package com.uis.exception_lab;

public class Card {

	private String accountNumber;
	private double balance;

	public Card() {
		super();
	}

	public Card(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if(accountNumber.trim() ==  null || accountNumber.trim().isBlank() || accountNumber.trim().length() > 16) {
			throw new IllegalArgumentException("Invalid Account number !!");
		}else {
			this.accountNumber = accountNumber;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance <= 0) {
			throw new IllegalArgumentException("Account balance cannot be negative value or 0");
		} else {
			this.balance = balance;
		}
	}

	@Override
	public String toString() {
		return "Card [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
