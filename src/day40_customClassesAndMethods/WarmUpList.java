package day40_customClassesAndMethods;
import java.util.*;
public class WarmUpList {
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Venus");
		myList.add("Sun");
		
		String targetWord = "Sun";
		
		System.out.println(countOccurances(myList, targetWord));
		
		
	}
	public static int countOccurances(ArrayList<String> list, String word) {
		
		int count=0;
		
		for (String str:list) {
			if (str.contentEquals(word)) {
				count++;
			}
		
			}
		return count;
		}
		


}
