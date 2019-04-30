package day20_forLoop;
import java. util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter the number:");
		int num = scan.nextInt();
		
		if (num <1 || num >10) {  // we can not use && cuz no any number is less than 1 at the same time bigger than 10
			System.out.println("ERROR!!! Invalid input!");
			return; // System.exit(0); // STOP EXECUTION
		}
		
		
		for (int i =1; i <=10; i++) {
			System.out.println(num+" x "+i+" = "+(num *i));
		
			
			
		}
		
	}

}
