package day12_Switch_ternary;
import java.util.*;

public class CalculatorV01 {
  public static void main(String[]args) {
	
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
	
	if (operator.equals("+")) {
		result =  num1 + num2;
		
	} else if (operator.equals("-")) {
		result = num1 - num2;
		
	} else if (operator.equals("*")) {
		result = num1 * num2;
		
	} else if (operator.equals("/")) {
		result = num1 / num2;
		
	}else if (operator.equals("%")) {
		result = num1 % num2;
	} else {
		System.out.println("Invalid operator: " + operator);
		return; // it doesnt execute remaining code after this, result will not be print
	}
	System.out.println("Result: " + result);
	char letter = scan.next().charAt(0); 
	int vowel = 0;
	int consonant = 0;
	if (('a' <= letter) && (letter <= 'z')){
		  switch (letter){
		    case 'a' :  case 'e' :  case 'i' :  case 'o' :  case 'u' :
		      System.out.println("The letter is vowel");
		      
		      break;
		    default :
		      System.out.println("The letter is consonant");
		      break;
		  }
		} 
	
	
	
	
}
}
