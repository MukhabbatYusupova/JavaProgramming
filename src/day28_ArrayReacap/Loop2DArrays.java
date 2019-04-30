package day28_ArrayReacap;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		
		String [][] pizzas = {{"pinapple", "pepperoni"}, 
				{"anchovies", "mushroom", "olives"},
				{"4 cheese"},
				{"chicken", "tomatoes", "peppers", "onions"},
				{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}};
		
		//System.out.println(Arrays.toString(pizzas[0]));
		
		
		for (String []pizza:pizzas) {
			System.out.print(pizza.length+ " - ");
			System.out.println(Arrays.toString(pizza));
		}
		//
		System.out.println("####for loop####");
		
		for (int i = 0; i< pizzas.length; i++) {
			System.out.print(pizzas[i].length+ " - ");
			System.out.println(Arrays.deepToString(pizzas[i]));
		}
		System.out.println();
		
		for (String topping : pizzas[0]) {
			System.out.println(topping);
		}
	
	
	int [][] students = {
			            {4,5,6,}, 
			            {12,5,7,},
			            {23,55,12,55,3}
			            };
	
	// 2 parts: outer loop, inner loop
	// outer loop takes each group
	// inner loop takes each value
	
	
	for (int [] group : students) {
		for (int studentId : group) {
			System.out.print(studentId + " ");
		}
		System.out.println();
	}
	
	int [][]nums = {
			{10, 20},
			{20,30,40,50},
			{100, 200, 400},
			{555,333,222,111,666,78},
	               };
	
	for (int i = 0; i < nums.length; i++) { // to take an array
		for (int j = 0; j < nums[i].length; j++) { // to take an array elements
		System.out.print(nums[i][j]+ " ");	
		}
		System.out.println();
	}
	
	
	
	
	
	
	}

}
