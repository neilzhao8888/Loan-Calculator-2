package com.ethoslending.calculator.controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.ethoslending.calculator.model.Input;

public class InputParser {

	private static String decimalPattern = "([0-9]*)(\\.([0-9]*))*";  
	private static String interestPattern = "([0-9]*)(\\.([0-9]*))*(\\%)?";  
	private static String intPattern = "([0-9]*)";  

	public static Input readInput() {
		
		
		double amount;
		double interest;
		double downpayment;
		int term;
		
		System.out.println("\n-- Loan Payment Calculator By Neil Zhao -- ");
		System.out.println("\nPlease enter follow parameters one by one.\n");
				
		Scanner scanner = new Scanner(System.in);
		
		//. Accept amount input
		do {
			System.out.print("Enter Amount: ");
			String amountStr = scanner.nextLine().trim();
			boolean valid = Pattern.matches(decimalPattern, amountStr);	
			if (valid) {
			   amount = Double.valueOf(amountStr);
			   break;
			}
			else {
			   System.out.println("Invalid Amount.");	
			}
			
		} while (true);
		
		//. Accept interest input
		do {
			System.out.print("Enter Interest: ");
			String interestStr = scanner.nextLine().trim();
			boolean valid = Pattern.matches(interestPattern, interestStr);	
			if (valid) {
			   if (interestStr.endsWith("%")) {
				  interest = Double.valueOf(interestStr.substring(0, interestStr.length()-1))/100; 				   
			   } else { 		   				
			      interest = Double.valueOf(interestStr);
			   }
			   
			   break;
			}
			else {
			   System.out.println("Invalid Interest.");	
			}
			
		} while (true);

		//. Accept downpayment input
		do {
			System.out.print("Enter Downpayment: ");
			String downpayStr = scanner.nextLine().trim();
			boolean valid = Pattern.matches(decimalPattern, downpayStr);	
			if (valid) {
			   downpayment = Double.valueOf(downpayStr);
			   break;
			}
			else {
			   System.out.println("Invalid Downpayment.");	
			}
			
		} while (true);
		
		//. Accept downpayment input
		do {
			System.out.print("Enter Term: ");
			String termStr = scanner.nextLine().trim();
			boolean valid = Pattern.matches(intPattern, termStr);	
			if (valid) {
			   term = Integer.valueOf(termStr);
			   break;
			}
			else {
			   System.out.println("Invalid Term.");	
			}
			
		} while (true);


		Input input = new Input();
		input.setAmount(amount);
		input.setInterest(interest);
		input.setDownpayment(downpayment);
		input.setTerm(term);

		System.out.print("Your inputs are:");
		System.out.println(input);
	
		System.out.println("\nJust press [Enter] key to do payment calculation");
		scanner.nextLine();
				
        return input;
	}
	
}
