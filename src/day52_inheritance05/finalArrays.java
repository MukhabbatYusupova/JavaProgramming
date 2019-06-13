package day52_inheritance05;

import java.util.Arrays;

public class finalArrays {
	public static void main(String[] args) {
		
	
	final int [] TEAMS = new int[]{11, 11};
	
	System.out.println("Team 1: " + TEAMS[0]);
	System.out.println("Team 2: " + TEAMS[1]);
	
	TEAMS[0]=10;
	TEAMS[1]=9;
	
	System.out.println("Team 1: " + TEAMS[0]);
	System.out.println("Team 2: " + TEAMS[1]);
	
	// TEAMS = new int{10,10,10} <== we can not re assign  by creating new object
	
	
	int[] nums = new int[] {1,2,3345,7,788};
	nums = new int[] {2323, 112,123};  // <==  this is not final so it allows me to create new obj
	
	final int[] finalNums = new int [] {23,44,55,66,65};
	// finalNums = new int [] {} Wrong
	 
	 final double [] PRICES = new double[3];
	PRICES[0] = 85.5;
	PRICES[1] = 99.99;
	PRICES [2] = 99.98;
	
	System.out.println(Arrays.toString(PRICES));
	
	PRICES [0] = 65.0;
	System.out.println(Arrays.toString(PRICES));
	
	// PRICES = new double [3]; <== doesnt work!!! [0.00, 0.00, 0.00]
	
	
}
}
