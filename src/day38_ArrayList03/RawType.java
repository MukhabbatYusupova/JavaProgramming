package day38_ArrayList03;
import java.util.*;
public class RawType {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		list.add("Saturday");
		list.add("JavaDay");
		list.add(1000);
		list.add(9.99);
		list.add(true);
		list.add('c');
		/** all values are stored as a raw type, general object type, 
		 * not specifying that is really string or int **/
		
		System.out.println(list);
		String allValues = list.toString(); // we use toString to put our list values to String
		System.out.println(allValues);
		
		String str = list.get(0).toString();
		
		System.out.println(str);
	}

}
