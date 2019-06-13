package day16_String_manipulation;

public class TrimSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String word1 = " String Methods ";
	System.out.println(word1.trim()); // it will not effect middle space
	System.out.println(word1);
	
	String word2 = ("   Three spaces");
	System.out.println(word2.trim());  // removes all the spaces before or after the string
		
		
		

	}

}
