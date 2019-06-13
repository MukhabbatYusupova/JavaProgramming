package day37_ArrayList02;
import java.util.*;
public class removeInteger {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(4);
		nums.add(1);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums);
		
		nums.remove(5);
		
		System.out.println(nums);
		
		
		Integer n1 = new Integer (5);
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);
		nums.remove(new Integer(4));
		
		System.out.println(nums);
		
		
		
		
		
	}
	
	

}
