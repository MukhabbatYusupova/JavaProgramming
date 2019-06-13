package day18_while_loop2;
import java.util.*;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner (System.in);
 
 int secretPincode = 1234;
 
 int pincode = 0;
 
 while (pincode != secretPincode) {
	 System.out.println("Enter your pincode!");
	 pincode = scan.nextInt();
 }
	System.out.println("Access granted!");	
	}

}
