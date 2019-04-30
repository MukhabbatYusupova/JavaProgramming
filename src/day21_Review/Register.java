package day21_Review;

import java.util.*;

public class Register {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner (System.in);
		
	System.out.println("How many items are you purchasing? ");
	
	int itemCount = scan.nextInt();
	String itemList = "";
	double totalPrice = 0.00;
		
		for (int count = 1; count <= itemCount; count++) {
			
			System.out.println("what is item "+ count + "?");
			String itemName = scan.next();
			
			System.out.println("How much is "+ itemName + "?");
			double itemPrice = scan.nextDouble();
			// add itemName to itemList and itemPrice to totalPrice
			itemList +=itemName+ ", ";
			totalPrice += itemPrice;
			
			
			//if itemList ends with , space get rid of that ", "

			
		}
		if (itemList.endsWith(", ")) {
			
		System.out.println("Your items: " + itemList.substring(0, itemList.length()-2));
		System.out.println("Your total price: $" + totalPrice);
		}
	}

}
