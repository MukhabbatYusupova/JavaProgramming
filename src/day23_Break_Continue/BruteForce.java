package day23_Break_Continue;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		

Scanner scan = new Scanner (System.in) ;

		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		
		String username = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts == 0) {
				System.out.println("You have exceeded number!");
				System.out.println("This user have been deactivated for 30 minutes!");
				return;
			}
			attempts--;
			System.out.println("Please enter the username:");
			username =scan.next();
			if (!username.contentEquals(expectedUserName)) {
				System.out.println("Wrong username");
				System.out.println(attempts + " attempts left");
				continue;
				
			}
			System.out.println("Please enter the password:");
			password = scan.next();
			
			if (!password.contentEquals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println(attempts + " attempts left");
		
			}	
		}while (!username.contentEquals(expectedUserName) || !password.contentEquals(expectedPassword));
		
		System.out.println("Login successful!");
		
			
		
	}

}
