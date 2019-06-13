package day39_ArrayList04;

import java.util.ArrayList;
import java.util.Collections;

public class CitiesArray {

	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
       
        
        for (String c: cities) {
        	System.out.print(c+ " | ");
        }
        System.out.println();
        
        for (int i=0; i<cities.size(); i++) {
        	System.out.print(cities.get(i)+ " | ");
        }
        System.out.println();
        System.out.println(cities.toString().toUpperCase());
        
        for (int i=0; i<cities.size(); i++) {
        	cities.set(i, cities.get(i).toUpperCase());
        	System.out.print(cities.get(i)+ " | ");
        }

        System.out.println();
//        Collections.sort(cities);
//        
//        System.out.println(cities);
        
        String longestCity = "", shortestCity = cities.get(0);
        for (String c: cities) {
        	if (c.length()> longestCity.length()) {
        	longestCity =c;
        	}
        }
        
        
        for (String c: cities) {
        	if (c.length()< shortestCity.length()) {
        	shortestCity =c;
        }
        	}
         System.out.println("Longest city: "+ longestCity+ " | Shortest city: "+ shortestCity);
        
         
         
         
         ArrayList<String> citiesMoreThan6 = new ArrayList<>();
         
         for (String c: cities) {
        	 if (c.length()>6) {
        		 citiesMoreThan6.add(c);
        	 }
         }
         System.out.println("Cities more than 6 letters:" +citiesMoreThan6);
         
         
	}

}
