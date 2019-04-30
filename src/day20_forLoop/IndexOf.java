package day20_forLoop;

public class IndexOf {

	public static void main(String[] args) {
		
		String word = "amazon";
		char letter = 'm';
		int index =-1;
		
		for (int i =0; i < word.length(); i++) {
			
			if (letter==word.charAt(i)) {
				index = i;
				break;
			}
		}
		 System.out.println("Index of "+ letter + " is " + index);
		 
		 
	}

}
