package day09_StringEqualsConditions;
import java.util.Scanner;

public class Canada {
public static void main(String[]args) {
	
System.out.println("What is the Capital of Canada?");
Scanner scan = new Scanner (System.in);
String capital = scan.nextLine();

if (capital.equalsIgnoreCase("Ottawa")) { //equalsIgnoreCase turns off case sensetive.
	System.out.println("Your answer is correct!");
} else { 
	System.out.println("Your answer is incorrect! " +capital+ " is not capital of Canada" ) ;
}



	}
}
