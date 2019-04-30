package day20_forLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word = "Wooden Spoon";
		// usimg for loop, print each character sepratley;
		//print only consonants seperately
		//print only vowels seperately
		
		for (int i =0; i < word.length(); i++) {
		
		System.out.print(word.charAt(i));
			
		}
		System.out.println();
		
		for (int i = 0; i < word.length(); i++) {
			char letter =word.toLowerCase().charAt(i);
			if(letter == 'a'|| letter =='e'|| letter=='o' ||letter =='i'|| letter == 'u') {
				System.out.print(letter+ ", ");
			} 
			
			}
			
			System.out.println();
			
			for (int i = 0; i < word.length(); i++) {
				char letter =word.toLowerCase().charAt(i);
				if(!(letter == 'a'|| letter =='e'|| letter=='o' ||letter =='i'|| letter == 'u')) {
					System.out.print(letter+ ", ");
		}
		
	}

	}
}