package day35_Review;

public class encripted {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "muhabbat";  //vzhgvi
		
		
		// get a char from word
		// find indexOf the char in aphabet
		// read the char frm encrypted at that index
		// add to some string
		
		
		
//		for (int i =0; i<word.length(); i++) {
//		char encAbc = encrypted.charAt(alphabet.indexOf(word.charAt(i)));
//		System.out.print(encAbc);
//			
//		}
		
		char first = word.charAt(0); // 'e'
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);
		
		//with a loop
		String encryptedWord = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			//System.out.print(encrypted.charAt(index));
			encryptedWord+=encrypted.charAt(index);
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		
		 

	}

}
