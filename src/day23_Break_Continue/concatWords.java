package day23_Break_Continue;
import java.util.*;
public class concatWords {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	
	
	String word = ""; 
	String allWords = "";
	
	for (int i = 0; i<6; i++) {
		System.out.println("Enter the word:");
		
		word = scan.next(); 
		

		if (word.contentEquals("java")) {
			continue;
		
		}
		allWords += word+", ";
	
	}
System.out.println(allWords.substring(0, allWords.length()-2)+ ".");
	}

}
