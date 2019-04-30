package day10_IfElse;
import java.util.*;
public class CreditScoreRating {
	public static void main(String[]args) {
		
	Scanner scan= new Scanner (System.in);
	
	System.out.println("Enter your credit score:");
	
	int creditScore = scan.nextInt();
	
	// excellent 750 - 850
	if (creditScore >= 750 && creditScore <= 850) { //if it is more than 750 and less than 850 ==> TRUE
		System.out.println("Excellent");
	}else if (creditScore >= 700 && creditScore <=749) {
        System.out.println("Good");		
	}else if (creditScore >= 650 && creditScore <= 699) {
		System.out.println("Fair");
	}else if (creditScore >= 550 && creditScore <=649) {
		System.out.println("Poor");
	}else if ( creditScore >= 0 && creditScore <= 549) {
		System.out.println("Bad");
	} else {System.out.println("Invalid score");
	
	
	}
	
	
	if (creditScore >= 750) {
		if (creditScore <= 850) {
			System.out.println("Excellent");
		}
		}if (creditScore >= 700) {
		 if (creditScore <=749) {
	        System.out.println("Good");}		
		
	}


}
}
