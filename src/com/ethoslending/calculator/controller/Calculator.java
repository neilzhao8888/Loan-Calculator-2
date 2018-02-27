package com.ethoslending.calculator.controller;

import com.ethoslending.calculator.model.Input;
import com.ethoslending.calculator.model.Output;

public class Calculator {


   public Output doCalculate(Input input)
   {
	   // Monthly interest rate and is the yearly rate divided by 12
	   double monthlyRate = input.getInterest() / 12.0;
	       
	   // The length of the term in month that is the number of years times 12\	       
	   int termInMonths = input.getTerm() * 12;
	         
	   // The Math.pow() method is used calculate values raised to a power	       
	   double monthlyPayment = 
	    		((input.getAmount()-input.getDownpayment())*monthlyRate) / 
	            (1-Math.pow(1+monthlyRate, -termInMonths));
	   	   	   
	   //. Total Payment
	   double totalPayment = termInMonths*monthlyPayment;
	   
	   //. Total Interest Pay
	   double totalInterest = totalPayment - (input.getAmount()-input.getDownpayment());
	   
	   	   
	   Output output = new Output();
	   output.setMonthlyPayment(monthlyPayment);
	   output.setTotalPayment(totalPayment);
	   output.setTotalInterest(totalInterest);
	   
	   
	   return output;
   }
	
}
