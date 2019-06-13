package day22_review2;

public class substringReview {

	public static void main(String[] args) {
		
		String sentence = "He said hi, then she replied hi. hi guys!";
		
		
		int count = 0;
		
		for (int i =0; i<sentence.length()-1; i++) {       // printing every two letters from the string
			String temp = sentence.substring(i, i+2);
			//System.out.println(temp);
			if (temp.contentEquals("hi")) {
				count++;
			
			}
			
		}
			System.out.println(count); // 3
			System.out.println(count == 3);
	}

}
