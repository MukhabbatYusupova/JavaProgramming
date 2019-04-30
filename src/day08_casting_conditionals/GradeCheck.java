package day08_casting_conditionals;
import java.util.*;
public class GradeCheck {
public static void main(String []args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("### START PROGRAM ###");
	System.out.println("What is your' grade?");
	 char grade = scan.next().charAt(0);
	 
	 if (grade == 'A') {
		 System.out.println("EXCELLENT JOB!!! KEEP IT UP!");
	 }else {
		 System.out.println("GOOD!");
	 }
	
	System.out.println("How many point did you miss for " + grade+ "?");
	
	int points = scan.nextInt();
	System.out.println("You could earn " + points +"more points if you studied harder");
	System.out.println("### END PROGRAM###");
	
}
}
