package com.uis.exception_lab.exception;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = -1561100347655328127L;

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException() {
		super();
	}
}
