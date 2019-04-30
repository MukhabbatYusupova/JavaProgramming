package day11_logical_nestingif;
import java.util.*;
public class LogInTests {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		System.out.println("Enter your Username:");
		String username = keyboard.next();
		System.out.println("Enter your password:");
		String password = keyboard.next();
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Log in is sucessful, Welcome!!!");	
		}else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println ("Invalid Username!");
		}else if (username.contentEquals(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid password!");
		}
		
	}

}
