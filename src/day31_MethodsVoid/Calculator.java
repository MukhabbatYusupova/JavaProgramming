package day31_MethodsVoid;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	int n1 = 12;
	int n2 = 5;
		add(n1, n2);
		subtract(n1, n2+2);
		multiply(n1,n2);
		divide (n1,n2);
		remainder(n1,n2);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		
		System.out.println("Select an operator +, -, *, /, %");
	 String operator= scan.next();
	 
	 switch (operator) {
	 case "+": 
		add(no1,no2);
		 break;
	 case "_":
		 subtract(no1, no2);
		 break;
	 case "*":
		 multiply(no1,no2);
		 break;
	 case "/":
		 divide(no1, no2);
		 break;
	 case "%":
		 remainder(no1, no2);
		 break;
		default:
			System.out.println("Invalid operator!");
	 }


	}
	
	public static void add (double num1, double num2) {
		double result = num1+num2;
		System.out.println(result);
	}
	
	public static void subtract(double num1, double num2) {
		double result;
		System.out.println( result= num1-num2);
	}

	public static void multiply(double num1, double num2) {
		double result = num1* num2;
		System.out.println(result);
	}
	public static void divide (double num1, double num2) {
		if (num2==0) {
			System.out.println("Can not divide");
			return; // exit the method here
		} 
	double result = num1/num2;
	System.out.println(result);
}
	public static void remainder (double num1, double num2) {
		double result = num1%num2;
		System.out.println(result);

	}
}
