package day52_inheritance05;
import java.util.*;
public class finalArrayList {
	
	public static void main(String[] args) {
		
	final ArrayList<String> COLORS = new ArrayList<>();
	
	COLORS.add("Orange");
	COLORS.add("Blue");
	COLORS.add("White");
	COLORS.add("Grey");
	
	System.out.println(COLORS.toString());
	
	// IMPOSSIBLE (Creating new object)
	
//	COLORS = new ArrayList<>(); 
//	System.out.println(COLORS.toString()); // empty
//	COLORS.add("Yellow");
		
		
		
		
	}

}
