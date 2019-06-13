package day19_doWhileloops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word = "Amazon";
	             //012345 -- index of char
	             //123456 -- length of the word
	// print each character one by one in seprate lines
	
	int idx = 0;
	while (idx < word.length()) {
		System.out.println(word.charAt(idx++)); // or we can use idx ++ next line
		//idx++;
	}
	
	System.out.println();
	
		int idx2 = word.length()-1; // ==5. starting 5 print reverse, than 4, 53,2,1,0
		while (idx2 >= 0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
		
	}

}
