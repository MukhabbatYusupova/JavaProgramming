package day22_review2;

import java.util.Scanner;

public class ENterMonthDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int month;
//month: 1 2 3 4 5 6 7 8 9 10 11 12
		
		do {
			System.out.println("Enter the month: ");
			
			 month = scan.nextInt();
			
		} while (month >=1 && month<=12);
		
		System.out.println("invalid month " + month +"!");
	}

}
