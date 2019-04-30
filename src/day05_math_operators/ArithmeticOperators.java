package day05_math_operators;

public class ArithmeticOperators {
	public static void main (String[] args) {
		System.out.println(55+5);
		
		int chairs = 140;
		System.out.println(chairs+2);
	
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		int result = 44-23;
		
		double balance = 1200.50;
		double transaction = 56.44;
		
		System.out.println(balance - transaction);
		System.out.println(balance);
		
		balance = balance - transaction;
		System.out.println(balance);
		
		int linesOfCodes = 50;
				System.out.println( "Lines of code " + linesOfCodes);
			linesOfCodes = linesOfCodes - 2;
				System.out.println("Lines of code " + linesOfCodes);
				
		System.out.println(22*2);
		int classes = 5;
		System.out.println(linesOfCodes * classes);
		
		int totalLinesOfCode = linesOfCodes * classes;
		System.out.println("totalLinesOfCode = " + totalLinesOfCode);
		
		System.out.println(10/3); // 2 whole number gives whole result (3)
		System.out.println(10.0/3); // decimal number gives decimal result 3.333
		System.out.println(15/7);
		System.out.println(11*0);
		
				
		
	}
	

}
