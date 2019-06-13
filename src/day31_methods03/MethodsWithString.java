package day31_methods03;

import java.util.Arrays;

public class MethodsWithString {

	public static void main(String[] args) {
		
		countWords("Java is fun");
		countWords("This is method with strings");
		googleSearchResults("About 121,000,000 results (0.79 seconds) ");

	}

	
	public static void countWords(String sentence) {
		
		String[]str= sentence.split(" ");
		System.out.println("Words in this sentence "+ Arrays.toString(str));
		System.out.println("Number of words "+ str.length);
	}
	
	public static void googleSearchResults(String str){
		String [] words =  str.split(" ");
		String str1 = words[1].replace(",", "");
		
		String seconds = words[3].replace("(", "");
		
		System.out.println("Result count: " + str1);
		System.out.println("Times in second: " + seconds);
		
	}
	
	
	
}
