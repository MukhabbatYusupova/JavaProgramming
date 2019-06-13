package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);

		double num1, num2, result;
		String operator;
		
		System.out.println("Enter your first number:");
		num1 = scan.nextDouble();
		
		System.out.println("Select operator:");
		operator = scan.next();
		
		System.out.println("Enter your second number:");
		num2 = scan.nextDouble();
		
		result = 0.0;
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;	
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default: 
			System.out.println("Invalid operator");
			break;
		    
			
		}
		
		System.out.println("Result: " + result);
		
		
		

	}

}
