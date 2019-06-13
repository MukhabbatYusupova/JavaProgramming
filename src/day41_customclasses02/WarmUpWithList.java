package day41_customclasses02;
import java.util.*;
public class WarmUpWithList {
	
	public static List<Integer> doubleTheList(List<Integer> nums){
		for (int i = 0; i<nums.size(); i++) {
			nums.set(i,nums.get(i)*2);
		} return nums;
		
		
	}
	public static void main(String[] args) {
		
		List <Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(11);
		numsList.add(6);
		System.out.println(doubleTheList(numsList));
		
		List <Integer> numsList2 = new ArrayList<>();
		numsList2.add(100);
		numsList2.add(111);
		numsList2.add(60);
		System.out.println(doubleTheList(numsList2));
		
	}

}
