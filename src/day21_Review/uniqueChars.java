package day21_Review;
import java.util.*;

public class uniqueChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = scan.next();
		String unique = "";

	
		for (int i = 0; i <word.length(); i++){
		// i is increases every time 
		
		char letter = word.charAt(i); //i always changes(0,1,2,..) and it reads different letters evrytime
		
		if (!unique.contains("" + letter)) {
			unique +=letter; //add letter to unique
		}
		
		}
		
		System.out.println(unique);
		
		
		
		
		
		
		char ch =word.charAt(0);
		System.out.println(unique.contains(""+ch)); // to make a char into string concat it with ""
	               // so contains can not work with char, the easiest way to make char into string using ""
	
	
		
		if (!unique.contains(""+ch)) {// if unique doesnt contain that character - take that ch add to unique
		unique+= ch; // unique = unique+ch;
	}
		if (unique.indexOf(ch) == -1) { // it means if that character is not there, if the char is not in the word indexOf always returns -1
			
		}
	
	
		//==============
	String word2 = "bananas";
	String unique2 ="";
	
	int i = 0;
	char ch2 = word2.charAt(i); // it returns 'b' (0)
	
	i = 1;
	ch2 = word2.charAt(i); // 'a' (1)
	
	i ++;
	ch2 = word.charAt(i); // 'n' (2)
	
	// ===============================	
	}

}
