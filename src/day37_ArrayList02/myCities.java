package day37_ArrayList02;
import java.util.*;
public class myCities {

	public static void main(String[] args) {
	
ArrayList <String> cities = new ArrayList <>();
	cities.add("Barnaul");
	cities.add("Dushanbe");
	cities.add("Tashkent");
	cities.add("Baku");
	cities.add("Astana");
	cities.add("Baku");
	
	for (String city : cities) {
		System.out.print(city+ " ");
	}
	System.out.println();
	for (int i =0; i<cities.size(); i++) {
		System.out.print(cities.get(i)+ " "); // cities(i) doesnt work!
	}
	System.out.println();
     cities.remove("Baku");
     System.out.println(cities);
     
     
     //isEmpty
     System.out.println(cities.isEmpty());// gives false
     
     cities.add(0,"Bishkek"); // 
     
     System.out.println(cities);

     cities.add(1, "Istanbul");
     
     cities.set(2, "Seoul");
     System.out.println(cities.toString());
     
     // i am finding the index of Dushanbe and replacing it with Vienna
     int idx = cities.indexOf("Dushanbe");
     cities.set(idx, "Vienna");

     System.out.println(cities.toString());
     
     
cities.clear();	 // clearing all the list

 boolean empty = cities.isEmpty();  // checking if it is empty
 
 System.out.println("empty: " + empty);
	
	
	
	}
	
	
	 public static String removeFirst(String target) {
		    
		  // ArrayList<String> str = new ArrayList<>();
		    
		 target.substring(1);
		    return target;
		    
		  }


}
