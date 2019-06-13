package day34_methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String... args) {
		
printWords("red", "blue", "yellow"); //3 values
printWords("grey"); // 1 value
printWords(); // empty -->String [] strArr = new String [0]<== no values

String [] myPets = {"cat", "house", "sheep", "cow"};
printWords(myPets);

sum(2,3,4,5);
	System.out.println(sum(2,3,4,5,6, 11, 345));
	
	int budget = 200;
	int total = sum(10,45, 110, 30);
	
	if (total<=budget) {
		System.out.println("Within budget");
	} else {
		System.out.println("broke!");
	}
	System.out.println(total);
	
	
	cook("Borsht", "Cabbage", "Beets", "Meat", "Potato");
	
	
	shoppingList(1000, "Avacado Toast", "Watch","Shoes");
	
	}
	
	
	public static void printWords(String ...words) { 
		// handle it like an ARRAY
		
		for (String w :words) {
			System.out.print(w + " ");
			
		}
		System.out.println();
	}
	
	
	
	public static int sum(int ...nums) {
		 int sum = 0;
		 
		 for (int n :nums) {
			 sum +=n; // sum = sum+n;
		 }
		  return sum;
	}
	
	public static void cook (String name, String ...ings) {
		System.out.print("Food: "+ name + "-");
		System.out.println(Arrays.toString(ings));
		
	}
	
	public static void shoppingList(int totalPrice, String ...items) {
		System.out.println("Total cost: "+ totalPrice);
		System.out.println("Bought items: "+Arrays.toString(items));
		
	}

}
