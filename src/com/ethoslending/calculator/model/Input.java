package com.ethoslending.calculator.model;

public class Input {

	private double amount; //: 1000000
	private double interest; //: 5.5%
	private double downpayment;//: 20000
	private int term; //: 30
	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	
	@Override
	public String toString() {
		return "Input [amount=" + amount + ", interest=" + interest + ", downpayment=" + downpayment + ", term=" + term
				+ "]";
	}
	
	
}
