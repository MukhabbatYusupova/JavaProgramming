package day08_casting_conditionals;

public class ImplicitCasting {
	
	public static void main(String []args) {
		
		//automatic casting from smaller than larger
		
		short shortValue = 3455;
		int intVaue = shortValue; // or (int)shortValue
		
		System.out.println("int value: " + shortValue);
		
		double price = 345; // implicitly, automatically converting to int.
		
		System.out.println(price); // it prints 345.0
		
		int price1 =34563;
		double dPrice = price1;
		System.out.println(dPrice);
		
		
	}

}
