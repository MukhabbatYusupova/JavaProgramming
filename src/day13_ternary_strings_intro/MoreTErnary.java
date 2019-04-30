package day13_ternary_strings_intro;

public class MoreTErnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String quality = "good";
		int rating = (quality.contentEquals("good")) ? 100 : 0;
		System.out.println("Rating: " + rating);
		
		int PMhour = 6;
		// Rush hour
		boolean rushHour;
		 rushHour = PMhour >= 4 && PMhour <= 7 ? true : false; // we can use optional ()
		  
		 System.out.println(PMhour + " is rush hour? " + rushHour);
		 
		 String result = rushHour == true ? "yes" : "no"; // we can not to use ==
		 
		 System.out.println(PMhour + " is rush hour? " + result);

		 int AMHour = 10; //6 -9
		 
		 String amRushHour = AMHour >=6 && AMHour <=9 ? "yes" : "no";
		 
		 
	}

}
