package day37_ArrayList02;

import java.util.ArrayList;

public class ShoppingList {
	public static void main(String[] args) {
		
		ArrayList<String>shoppingList = new ArrayList<>();
		shoppingList.add("watch");
		shoppingList.add("necklace");
		shoppingList.add("laptop");
		shoppingList.add("phone");
		
		int count = shoppingList.size();
		System.out.println(count);
		
		System.out.println(shoppingList.toString());
		// get the first and last item of the arrayslist
		System.out.print(shoppingList.get(0) + "|"+ shoppingList.get(count-1));
		
		shoppingList.remove(0); // or shoppinlist.remove("watch")
		System.out.println();
		System.out.println(shoppingList);
		
		// using loop
		
		for (String item :shoppingList) {
			System.out.println(item);
		}
		
// remove all items
		
		shoppingList.clear();
		
		System.out.println(shoppingList); //or shoppingList.toString()
		
		
	}
	

}
