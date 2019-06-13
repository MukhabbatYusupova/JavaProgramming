package day19_doWhileloops;
import java.util.*;
public class EnterPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;
		


		
		do {
			System.out.println("Enter the password:");
			input = scan.next();
		}
		while(!input.contentEquals(password));
	}

}
