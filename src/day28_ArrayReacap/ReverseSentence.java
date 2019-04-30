package day28_ArrayReacap;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "You love Java";
		String reversed = "";
		
		String[] words = sentence.split(" "); // delimiter 
		System.out.println(words.length); // 
		System.out.println(Arrays.deepToString(words));
		
		for (int i = words.length-1; i >=0 ; i--) {
			reversed+= words[i]+ " ";
		
		}
		reversed = reversed.trim();// cutting extra space at the end or beginning
		System.out.println(reversed);

	
	
	
	}

}
