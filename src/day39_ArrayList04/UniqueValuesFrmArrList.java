package day39_ArrayList04;
import java.util.*;
public class UniqueValuesFrmArrList {

	public static void main(String[] args) {
		List <Integer> nums =  new ArrayList<>();
		//Scanner scan = new Scanner (System.in);
		nums.add(10);
		nums.add(16);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(16);
		nums.add(4);
		
		
		System.out.println(nums);
		// Prtint Duplicated values only one time
		
		List<Integer> unique1 = new ArrayList<>();
		for (Integer num : nums) {
			if (!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1);

		// Print only unique Values
		
		List <Integer> unique2= new ArrayList<>();
		for (int i =0; i<nums.size(); i++) {
			int count=0;
			
			for (int j=0; j<nums.size(); j++) {
				if(nums.get(j)!=nums.get(i) && i==j) {
					count++;
					break;
				}
			}
			
			if (count==0) {
				unique2.add(nums.get(i));
			}
		}
		
		System.out.println(unique2);
		
	}

}
