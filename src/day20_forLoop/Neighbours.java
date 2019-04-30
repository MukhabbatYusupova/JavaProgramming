package day20_forLoop;
import java.util.*;

public class Neighbours {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String word = scan.next();
		
		//aabcdd
		                // abbcdd -1 < 5
		for (int i = 0; i<word.length()-1; i++) {
			if (word.charAt(i)== word.charAt(i+1)) {  // we are checking next character everytime thats why +1
			System.out.println("Beeep - " + word.charAt(i));	
			} 
			}
				
		
		// enter 2 words with the space on the same line
		// match are they same words or no
		
		String str = scan.nextLine();	
		
//		for (int i = 0; i < str.length(); i++) {
//			
//			if (str.substring(0,str.indexOf(" ").equals(str.substring(str.indexOf(" ")+1)))){
//				System.out.println("first word and second word are same");
//			}else {
//				System.out.println("Not matching!");
//			}
//		}
		
	}

}
