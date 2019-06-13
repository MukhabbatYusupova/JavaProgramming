package day34_methods06;

public class CountArray {
	
	public static void main (String [] args) {
		
		int []nums= {2,3,4,3,2,3,6,4,5,5,6,7,5,66};
		// 1.with Sysout u can print directly
		System.out.println(findOccurences(nums, 5)); 
		System.out.println(findOccurences(nums, 6));
		
		// 2. assign return value in a variable
		int fives = findOccurences(nums,5);
		
		System.out.println(fives);
		//
		if (fives >0) {
			System.out.println("Fives are "+ fives);
		}
		
		//
		if (findOccurences(nums, 2) >0) {
			System.out.println("2 is occured");
		} else {
			System.out.println("No 2");
		}
		// creta an array and pass to method without declaring another array out
		
		findOccurences(new int[] {1,2,3,4,5,7,7,88}, 7);
		
		int seven = findOccurences(new int[] {1,2,7,3,4,5,7,7,88,7}, 7);
		
		System.out.println(seven);
	}
	
public static int findOccurences(int[]arr, int value) {
	
	
	
		int count = 0;
		for(int num: arr) {
			if (num== value) {
			count++;
			 
		}
	}
	
		return count;
	
}
	
public static int[] getArray() {
	int []arrs = {1,2,3,4,3,4,5,6,7,8};
	
	return arrs;
}
	
	
	
	
	

}
