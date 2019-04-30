package day14_StringManipulation;
import java.util. *;

public class Words {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the 1st word: ");
	String word1 = scan.next();
	
	System.out.println("Enter the 2nd word: ");
	String word2 = scan.next();
	
	if(word1.length()> word2.length()) {
		System.out.println(word1 + "Word1Value is longer");
	} else if (word1.length() < word2.length()) {
		System.out.println(word2 + "Word2Value is longer");
	} else {
		System.out.println(word1 + " and " + word2 + " length are same");
	}
	
	
}
	
}
