package day24_Array;

import java.util.Arrays;

public class SumOfNums {

	public static void main(String[] args) {
		
// creating an array
		int[] nums = new int[3];
		
// first value in array		
		nums[0]=5;
// second value                 <== initializing values
		nums[1]=10;
// third value
		nums[2]=20;
		
		System.out.println(nums); // [I@3764951d <== this is hashcode we dont need it
		
		System.out.println(Arrays.toString(nums)); // we see the values [5, 10, 20]
		//toString() from arrays class can help us to print an arrays as string

		// lets calcululate
		
		int sum = 0;
		
		for (int i =0; i< nums.length; i++) {
			sum = sum + nums[i];

		} 
		 
		 System.out.println("Sum: "+ sum);
		 
		 //find largest value in the array
		 int max = Integer.MIN_VALUE;
		 
		 for (int i = 0; i<nums.length; i++) {
		 if(nums[i]> max) {
			 max = nums[i];
			 
			 
					 }
		 }
	
	System.out.println("Max value: "+ max);
	
	//find the minimum value
	
	 int min = Integer.MAX_VALUE;
	 
	 for (int i = 0; i<nums.length; i++) {
	 if(nums[i]< min) {
		 min = nums[i];
		 
		 
				 }
	 }

System.out.println("Min value: "+ min);
	
	}

}
