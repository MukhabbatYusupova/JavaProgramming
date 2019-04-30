package day18_While_loop2;

import java.util.*;

public class Pincode2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int secretPin = 4321;
		int pincode = 0;
		int attempts = 1;
		
		while (pincode != secretPin && attempts <= 3);{
			System.out.println("Enter your pin");
			pincode = scan.nextInt();
			attempts++;
			
			if (attempts ==3 && pincode != secretPin) {
				System.out.println("Card is blocked!");
				return;
			}
		}

		System.out.println("Acces granted!");

	}

}
