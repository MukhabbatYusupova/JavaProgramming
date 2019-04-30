package day07_ScannerOperators;

public class EnoughPizza {
	
	public static void main (String [] args) {
		// slices in pizza 8;
		//slices per student 2;
		int pizzaCount = 30;
		int studentCount = 145;
		
		
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentCount * 2;
		
		System.out.println("Is enough pizza: " + isEnoughPizza);
		
		
	}

}
