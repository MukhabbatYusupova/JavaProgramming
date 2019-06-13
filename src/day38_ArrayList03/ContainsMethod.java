package day38_ArrayList03;
import java.util.*;
public class ContainsMethod {
	public static void main(String[] args) {
		
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("March");
		list1.add("April");
		list1.add("May");
		
		System.out.println("list1: "+list1);
		
		ArrayList<String> months = new ArrayList<>(list1); // constructor taking lis1 values and copying
		
		System.out.println("Months: "+months);
		
		ArrayList<String>list2 = list1; // pointing to same object. if i change list1 list2 also changes
		System.out.println("list2: "+list2);
		
		list2.add(0, "Dec");
		System.out.println("After changing list 2: "+ list2 + " | list1 is changed too: "+ list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		
		System.out.println("Months after adding some more: "+ months);
		
		
		//contains
		
		System.out.println(months.contains("Jan")); // true
	    System.out.println(months.contains("Dec"));  // false - Dec is added to the list1/list2 later on
		
	// how to find a value is in that location
	    System.out.println(months.get(1).contentEquals("Feb"));// is february in index 1? True
	    
	    //containsAll
	    
	    ArrayList <String> month2 = new ArrayList <> (list1);
	    
	    System.out.println("Month: "+ months);
	    System.out.println("Month2: " + month2);
	    
	    // check all the values of month2
	    
	    if (months.containsAll(month2)) {
	    	System.out.println("months has all month2 values");
	    } else {
	    	System.out.println("some values are missing");
	    }
	    
	    

	}

}
