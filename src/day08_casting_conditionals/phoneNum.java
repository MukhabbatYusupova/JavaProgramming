package day08_casting_conditionals;

import java.util.*;

public class phoneNum {
	
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    int areaCode = scan.nextInt();
		    System.out.println(areaCode);
		    
		    int localNumber = scan.nextInt();
		    System.out.println(localNumber);
		    
		    String phoneNumber = "(" + areaCode + ")-" + localNumber;
		    
		    System.out.println("Calling number " + phoneNumber);
	
		
	}

}
