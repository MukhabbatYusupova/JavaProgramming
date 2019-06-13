package day42_customClasses_encapsulation;

public class Sturbucks {
	public static void main(String[] args) {
		
		//int[] nums = new int[2];
		Coffee [] coffeeArr = new Coffee[2]; // creating array
		
		coffeeArr[0]= new Coffee(); // creating first element
		
		coffeeArr[0].setCoffeeInfo("Espresso", "tall", 2.55, 7);
		coffeeArr[0].getCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.setCoffeeInfo("Latte", "grande", 4.50, 200);
		
		coffeeArr[1]=latte;
		coffeeArr[1].getCoffeeInfo();
		
	}

}
