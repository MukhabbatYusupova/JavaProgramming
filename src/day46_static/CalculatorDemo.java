package day46_static;

public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7); //calling using class name is static way
		
		System.out.println(result);
		
		System.out.println(result=Calculator.minus(44, 14));
		
		Calculator cal1 = new Calculator();
		
		System.out.println(cal1.multiply(4, 2)); // calling using the object// non static way
		
		
	}

}
