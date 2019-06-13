package day27_Array04;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int [] nums = {3,5,7,9,12,55};
		
		System.out.println(Arrays.binarySearch(nums, 7)); //2 index
		System.out.println(Arrays.binarySearch(nums, 55)); //4
		 
		System.out.println(Arrays.binarySearch(nums, 10));
		
		int i = Arrays.binarySearch(nums, 9);
		
		System.out.println(i);
		
	
		int [] numsUnsorted = {64, 3, 15,7,75, 9,12,55};
		// u can not use binary search with unsorted arrays!
		
System.out.println(Arrays.binarySearch(nums, 1, 4, 7)); // telling where to start and where to end the searching
		
	}

}
