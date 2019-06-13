package day31_methods03;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
	countUp(5);
	
	countUp(10);
	
	countDown(0);
	int n=5;
	countDown(n);
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an input:");
	//get a number from a keyboard
	int inputNum = scan.nextInt();
	
	// call a method and set it as input
    countUp(inputNum);
    
    drive("Audi", 60);
    drive("Honda", 70);
    
    
	}

public static void countUp(int num) { // void always comes just before the method
	
	
		if (num<1) {
			System.out.println("Invalid input!");
		} else {
			for (int i= 1; i<=num; i++) {
		System.out.print(i + " ");
		
		}}
		System.out.println();
	}

public static void countDown(int num) {
	if(num < 1) {
		System.out.println("Invalid input");
	}else {
		for(int n = num; n >= 1; n--) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
// multidimensional method

public static void drive(String car, int speed) {
	System.out.println(car+ " is driving " + speed + " mph");
	
	
	
	
}




}





