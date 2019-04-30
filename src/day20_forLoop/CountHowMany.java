package day20_forLoop;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "computer programming";
		char mychar = 'm';
		
		int counter = 0;
		 
		for (int i =0; i < word.length(); i++) {
			if (word.charAt(i)== mychar) {
				counter++;
			}
			
		
		}
		
		
		System.out.println("Count: " + counter +" "+ mychar);
		
		
	}

}
