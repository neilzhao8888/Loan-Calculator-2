package com.ethoslending.calculator.model;

import java.text.DecimalFormat;

public class Output {

    private double monthlyPayment;//: 454.23,
    private double totalInterest;//: 83523.23,
    private double totalPayment;//: 163523.23
	
    private static DecimalFormat df2 = new DecimalFormat(".##");

  
	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public double getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	public String getJson() {
/*
{
"monthly payment": 454.23,
"total interest": 83523.23,
"total payment" : 163523.23
}
*/

		StringBuffer sb = new StringBuffer();
	    sb.append("{");
	    sb.append("\n\"monthly payment\":"+ df2.format(monthlyPayment));
	    sb.append("\n\"total interest\":" + df2.format(totalInterest));
	    sb.append("\n\"total payment\":"+ df2.format(totalPayment));	    
	    sb.append("\n}");
				
		return sb.toString();		
	}


	@Override
	public String toString() {
		return "Output [monthyPayment=" + monthlyPayment + ", totalInterest=" + totalInterest + ", totalPayment="
				+ totalPayment + "]";
	}


    
}
