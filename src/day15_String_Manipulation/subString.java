package day15_String_Manipulation;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                // 0123456789
		String sentence = "Java String manipulation is fun";
		
		System.out.println(sentence.substring(0,4));
		
		System.out.println(sentence.substring(5,11)); //g is on 10 but it cuts before the mark so 11 
		
		System.out.println(sentence.substring(7,11));
		
		System.out.println(sentence.substring(10,5)); // is wrong!

	}

}
