package day36_wrapperClasses_Arraylist01;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
// declare 
		
		ArrayList<String>languages = new ArrayList<>();
		
		languages.add("Uzbek");
		languages.add("English");
		languages.add("Russian");
		languages.add("Persian");
		languages.add("Turkish");
		languages.add("Greek");
		languages.add("Ukrainian");
		
		System.out.println(languages.size());
		languages.add("Arabic");
		System.out.println(languages.size());
		
		languages.remove(0);
		System.out.println(languages.size());
		
		System.out.println(languages.toString());
		
	}

}
