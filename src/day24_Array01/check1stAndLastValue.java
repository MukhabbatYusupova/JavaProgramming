package day24_Array01;

public class check1stAndLastValue {

	public static void main(String[] args) {
		
		// write a program that will print true if 1st and last num is the same
		// if 1st and last value in the array of ints is same, print true
		
		int[] numbers = {12,41,213,21,42,12};
		
		

			boolean equals = numbers[0] == numbers[numbers.length-1];
			
			System.out.println(equals);
		/* if (numbers[0] == numbers[numbers.length-1]){
		 * sysout(true);
		 * } else {
		 * sysout(false);
		 * }
		 * 
		 * 
		 * 
		 * */	
			
			
		}

	}


