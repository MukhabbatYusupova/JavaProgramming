package day36_wrapperClasses_Arraylist01;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		// how to create
		String [] str =new String[5]; // basic array
		
		ArrayList<String> names =  new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		//how to assign value
		
		names.add("Roman");
		names.add("Mukhabbat");
		names.add("Gulnar");
		names.add("Natalia");
		
		nums.add(100);
		nums.add(1);
		nums.add(99);
		nums.add(new Integer ("100"));
		
		//read from arrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		
		//length
		
		System.out.println("Names count: "+ names.size());
		System.out.println("Nums count: "+ nums.size());
		
		
		
		
	}

}
