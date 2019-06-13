package day19_doWhileloops;
import java.util.*;
public class Palindrome {
	public static void main(String []args) {
		
		Scanner scan = new Scanner (System.in);
		
		String word = scan.next();
		String reverse = "";
		int idx = word.length()-1;
		
		while(idx >=0) {
		reverse = reverse + word.charAt(idx);
			idx --;		
		
			
		}
	
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("They are Palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
		
	}

}
