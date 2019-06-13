package day16_String_manipulation;

public class GetNumberFrmString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "I wrote [236000] lines of code today";
		
		//print number between [ and ]
		
		int start = sentence.indexOf('[') +1;
		int end = sentence.indexOf(']');
		
		String codeCount = sentence.substring(start, end);
		System.out.println("lines of code: " + codeCount);
		// another way merging all steps
		
		System.out.println(sentence.substring(sentence.indexOf('[') +1, sentence.indexOf(']')));
		
		// check if codecount is more than 10
	// we take codecount and make it int, string convert into int only it has numbers
		
		int count = Integer.parseInt(codeCount);    // for loong or doble or other numbers we use Double.parseDouble etc.
		if(count >20) {
		System.out.println("Write more than 20 lines of code everyday");
		} else {
			System.out.println("not enough  coding");
			
		}
	}

}
