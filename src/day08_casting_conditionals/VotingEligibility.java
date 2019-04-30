package day08_casting_conditionals;
import java.util.*;

public class VotingEligibility {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
	System.out.println("How old are you?");	
		int votingAge=18;
		int yourAge = scan.nextInt();
		
   if (yourAge >= votingAge) {
	   System.out.println("You were elligible to vote for "+ (yourAge - votingAge) +" years.");
   }else {
	   System.out.println("you need more "+ (votingAge-yourAge) + " years to go.");
   }		
	}
	

}
