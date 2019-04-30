package day15_String_Manipulation;

public class indexOf2 {
	public static void main(String[]args) {
		        // 0123456789
	String list = "html-selenium-angular-jenkins-grid-tablau";
	int firstDash = list.indexOf("-");
	System.out.println("First dash: "+ firstDash);
	
	int secondDash = list.indexOf("-",5); //search for dash starting 5 th character
	System.out.println("Second dash: "+ secondDash);
		
	int thirdDash = list.indexOf("-", secondDash+1); //
	System.out.println("third dash: " + thirdDash);
	
	int fourthDash = list.indexOf("-", secondDash + 9); // or thirdDash +1
	System.out.println("Fourth dash: " + fourthDash);
		
		// find the last dash
	int lastDash = list.lastIndexOf("-");
	System.out.println("last dash: " + lastDash);
		
	}

}
