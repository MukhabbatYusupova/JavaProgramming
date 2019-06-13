package day30_methods02;

import java.util.Scanner;

public class methods02 {

	public static void main(String[] args) {
		
print5Stars();
int count=0;
while (count <=100) {
	print5Stars();
	count++;
}
introduce();
introduce();

		
		

	}
	
	public static void print5Stars() {
		System.out.println("* * * * *");
	}
	
	
	public static void introduce() {
		Scanner scan = new Scanner (System.in);
		System.out.println("What's your name?");
		String name = scan.next();
		System.out.println("Nice to meet you!");
	}
	

}
