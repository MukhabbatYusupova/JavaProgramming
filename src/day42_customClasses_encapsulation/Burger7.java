package day42_customClasses_encapsulation;
import java.util.*;
public class Burger7 {
	
	public static void main(String[] args) {
		Burger burger1 = new Burger(); 
		
		burger1.name = "Cowboy";
		String [] ings = {"onion", "cheese", "pickles", "lettuse", "b7 sause"};
		
		burger1.ingreds = ings;
		
		System.out.println(Arrays.toString(burger1.ingreds));
		System.out.println(burger1.ingreds[0]);
		
		
		
		for (String i:burger1.ingreds) {
			System.out.println(i);
			
		}
	}
	

}
