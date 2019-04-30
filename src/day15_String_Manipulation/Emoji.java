package day15_String_Manipulation;
import java.util.*;

public class Emoji {
	public static void main(String[]args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		String firstChar = scan.nextLine();
		String secondChar = scan.nextLine();
		
		if (firstChar.contentEquals(":")) {
			if (secondChar.contentEquals(")")){
				System.out.println(firstChar + secondChar + " is a happy face");
			} else if (secondChar.contentEquals("(")) {
				System.out.println(firstChar + secondChar +" is a sad face");
		} else if (secondChar.contentEquals("/")) {
			System.out.println(firstChar + secondChar +" is an upset face");
		} else if (secondChar.equals("P")) {
			System.out.println(firstChar + secondChar +" is a playful face");
		}  else {
			System.out.println("Invalid character");
		}
		
	}
		
	
		
		String emoji = ":/";
		
		if (emoji.length()!= 2) { // check it is not 2 char
			System.out.println("Invalid emoji");
			return;   //stop execution if character is not 2 char
		}
		//if code reaches to this point then emoji is 2 char
		
		// geth first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first == ':') {
			if (second == ')' ) {
			System.out.println("happy");		
			} else if (second == '(') {
				System.out.println("sad");
			}else if (second == '/') {
				System.out.println("meh");
			} else {System.out.println("Unknown emoji");
			}
		} else if (first == ';') {
			if (second == ')') {
				System.out.println("wink");
			} else if (second == '(') {
				System.out.println("cry");
			} else  {System.out.println("Unknown character");}
		}else if (first == '(') {
			if ( second == ':') {
				System.out.println("upside down happy");
			} else {
				System.out.println("unknown emoji");
			}
			
		} else if (first == ')') {
			if (second == ':') {
				System.out.println("sad upside down");
			} else {
				System.out.println("unknown emoji");
			}
					} else {
						System.out.println("Invalid char!");
					}
	//switch
		
		
		 
	 
	}
	
	
		
		
	}


