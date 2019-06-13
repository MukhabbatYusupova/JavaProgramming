package day38_ArrayList03;

import java.util.*;
	

public class MethodSummary {

	public static void main(String[] args) {
		
List <String> list1 = new ArrayList<>();

list1.add("red");
list1.add("blue");
list1.add("white");
list1.add("grey");
list1.add("black");
list1.add(0, "yellow");

System.out.println(list1);

System.out.println(list1.size());
System.out.println(list1.get(3));
System.out.println(list1.get(list1.size()-1));

list1.remove(0);
list1.remove("blue");




list1.set(0, "orange");

System.out.println(list1); // replaces, overwrites, red will be gone

System.out.println(list1.indexOf("grey"));
System.out.println(list1.indexOf("pink")); // returns -1; cuz we dont have it

System.out.println(list1.isEmpty()); // check if the list empty
System.out.println(list1.size()==0); // same thing


//contains

System.out.println(list1.contains("white"));


List <String> list2 = new ArrayList<>();

//addALL

System.out.println(list2.addAll(list1));

System.out.println(list2);

// ContainsALL 

System.out.println(list1.containsAll(list2));

//equals

System.out.println(list1.equals(list2));


list2.add("purple");

list2.removeAll(list1);

list2.addAll(0, list1);
System.out.println(list2);

list1.clear();
list2.clear();
System.out.println(list1.isEmpty() && list2.isEmpty());

	}

}
