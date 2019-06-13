package day47_blocks;

import static day47_blocks.TestData.*;
import java.time.LocalDateTime;
public class BriteErp {
	
	static { // automatically runs, no need to call in main 
		System.out.println("Launch Browser");
		System.out.println("Navigate to "+ url);  // i am not using class name cuz i imported the data
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: "+ TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: "+ TestData.password);
	}
	
	public static void verifyLogIn() {
		System.out.println("Expected Name: "+ TestData.username);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login Successfull - "+LocalDateTime.now());
	}

}
