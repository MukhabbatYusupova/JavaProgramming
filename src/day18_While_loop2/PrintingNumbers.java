package day18_While_loop2;

public class PrintingNumbers {
	
	public static void main(String[]args) {
		
		//print count 0 to 100
		
		
		int counter = 0;
		
		while (counter <=100) {
			System.out.println(counter); // we can put here any message, that it prints that word so many times
			counter++;
		}
		
		System.out.println(counter);  // even tho it wsas inside the loop counter updated with ++ so we get 101
	}

}
