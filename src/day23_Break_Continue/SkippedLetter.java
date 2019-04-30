package day23_Break_Continue;

public class SkippedLetter {

	public static void main(String[] args) {
		

	//how to skip letters when printing
		
		String str = "java";
		
		for (int i =0; i <= str.length()-1; i++) {
			
			if (str.substring(i, i+1).equals("a")) {
				
				continue;
			}
			
			System.out.println(str.substring(i, i+1));
		}
	
	
	
	
	}

}
