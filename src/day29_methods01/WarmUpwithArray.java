package day29_methods01;

import java.util.Arrays;

public class WarmUpwithArray {

	public static void main(String[] args) {

	
	String[][] countries = {
			{"USA","Washington DC"},
			{"Canada", 	"Ottawa"},
			{"Mexico","Mexico city"},
			{"Brasil","Brasilia"},
			{"Peru", "Lima"},
			{"Argentina", "Boanes Aeros"},
			{"Bolivia","La Paz"},
			{"Macedonia","Scopia"},
			{"Kazakhstann","Nursultan"}
};

		for (String[] contArr : countries) {
			System.out.print(contArr[0] + "|");
		}
		System.out.println();
		

		String[] cities = new String[countries.length];

		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.println(Arrays.toString(cities));
		

		for (int i = 0; i < countries.length; i++) {
			if (countries[i][0].equals("Bolivia")) {

				if (countries[i][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Failed!");
				}
				break;
			}
		}

	}

}
