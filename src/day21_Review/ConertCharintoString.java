package day21_Review;

public class ConertCharintoString {

	public static void main(String[] args) {
		
	// following ways can be used to convert char to String
		
		char ch  = 'a';
		String str1 = "" + ch;
		
		
		char ch2 = 'v';
		String str2 = new String("" + ch2);
		
		String str3 = Character.toString(ch2);

	}

}
