package day11_logical_nestingif;
import java.util.*;

public class TollCalculator {
	public static void main(String []args) {
		
	Scanner keyboard = new Scanner (System.in);
		
	System.out.println("Enter the Vehicle Type:");
	int carType = keyboard.nextInt();
	
	System.out.println("Is it rush hour: yes | no");
	String answer = keyboard.next();
	boolean isrushHour;
	if(answer.equalsIgnoreCase("yes")){
			isrushHour = true;
	} else {
		    isrushHour = false;
	}
	//System.out.println(isrushHour);	
	
	double price = 0;
	if (carType ==1) {
		if(isrushHour) {
			price=30.0;
		}else {
			price = 5.0;
		}
	} else if (carType == 2) {
		if (isrushHour) {
			price = 55.30;
		} else {
			price = 15.99;
		}
	}
	System.out.println("Toll cost: " + price);
	}

}
