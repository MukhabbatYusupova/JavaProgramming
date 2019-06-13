package day38_ArrayList03;

import java.util.*;

public class AddAllMethod {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		
		list1.add("java");
		list1.add("python");
		
		List <String> list2 = new ArrayList <>();
		
		list2.add("C#");
		list2.add("C++");
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		

	String[] r1 = {"s", "t","u"};
	String[] r2 = {"d", "e", "n", "t"};
	  List <String> strList = new ArrayList <>();
	  
for(String arr1:r1) {
	strList.add(arr1);
}
	for(String arr2:r2) {
		strList.add(arr2);
	}  
	  
	  
	System.out.println(strList.toString());
	  
	   
	  }

}
