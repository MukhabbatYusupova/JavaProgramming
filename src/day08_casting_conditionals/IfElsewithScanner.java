package day08_casting_conditionals;
import java.util.*;

public class IfElsewithScanner {
public static void main (String[] args) {
	
	Scanner scan = new Scanner (System.in);
	int passingPercentage =65;
	
	
	 int yourScorePercentage = scan.nextInt();
	 
	 if (yourScorePercentage >= passingPercentage) {
		 System.out.println("YOU PASSED!!!");
	 }else {
		 System.out.println("YOU FAILED! STUDY MORE!");
	 }
	 
	System.out.println("Java  is Fun!");
	
	
	
	
	
	
	
	
	
}
}
