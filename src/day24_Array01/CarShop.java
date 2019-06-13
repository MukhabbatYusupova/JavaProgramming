package day24_Array01;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {

		String[] car = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		for (int i = 0; i < car.length - 1; i++)
			if (car[i].startsWith("M")) {
				System.out.println(car[i]);

			}
	System.out.println("***************");
	
	for(int i = 0; i < car.length-1; i++) {
		if (car[i].toLowerCase().contains("r")) {
			System.out.println(car[i]);
		}
	}
	
	// For Each LOOP
	
	System.out.println("*******************");
	
	for (String b: car) {
		if(b.endsWith("a")) {
			System.out.println(b);
		}
	}
	
	System.out.println("*********************");
	
	for (String c: car) {
		if(c.length()>5) {
			System.out.println(c);
		}
	}
	
	System.out.println("******************");
	
	// swap the first word with last word
	String temp = car[0];
	car[0] = car[car.length-1];
	car[car.length -1]=temp;
	
System.out.println(Arrays.deepToString(car));


System.out.println("Before sorting");
System.out.println(Arrays.toString(car));
Arrays.sort(car);
System.out.println("After sorting");
System.out.println(Arrays.toString(car));
		
	


	
	
	}

}


