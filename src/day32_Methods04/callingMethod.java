package day32_methods04;

public class callingMethod {

	public static void main(String[] args) {
//		add("oil, onion, meat");
//		mix (60);
//		fry (2);
		makePancakes();
		System.out.println();
		makePasta();

	}
	
	public static void makePasta() {
		
		System.out.println("~~ITALIAN PASTA~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti");
		mix(30);
		add("Parmesan cheese, Marinara sauce");
		System.out.println("~~ Enjoy your Pasta!~~");
		
		
	}
	public static void cook(String dish) {
		System.out.println("~~"+ dish.toUpperCase()+ " RECIPE~~");
		
	}
	public static void makePancakes() {
		cook("pancake");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix (120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKE~~");
	}
	
	public static void add(String ingredients) {
		System.out.println("add "+ ingredients);
	}

	
	
	public static void mix (int sec) {
		System.out.println("mix "+sec +" seconds");
		
	}
	
	 public static void fry(int min) {
		 System.out.println("fry "+min+" minutes");
	 }
	 public static void boil (int min) {
		 System.out.println(min+ " minutes");
	 }
	
}
