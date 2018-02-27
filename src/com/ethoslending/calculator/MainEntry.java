package com.ethoslending.calculator;

import com.ethoslending.calculator.controller.Calculator;
import com.ethoslending.calculator.controller.InputParser;
import com.ethoslending.calculator.model.Input;
import com.ethoslending.calculator.model.Output;

public class MainEntry {


	public static void main(String[] args) {
		
    
		Input input = InputParser.readInput();  		
//		input.setAmount(100000);
//		input.setInterest(0.055);
//		input.setDownpayment(20000);
//		input.setTerm(30);
		
		Calculator calc = new Calculator();
		Output output = calc.doCalculate(input);
		
		System.out.println("\nYour payment information are calculated as below:");
		System.out.println("-------------------------------------------------\n");

		System.out.println(output.getJson());
				
	}

}
