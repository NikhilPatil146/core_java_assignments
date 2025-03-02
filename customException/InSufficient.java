package com.customException;

public class InSufficient extends Exception {
	double amount;

	public InSufficient(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
}
