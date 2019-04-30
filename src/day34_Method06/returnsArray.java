package day34_Method06;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class returnsArray {
	
	
	public static void main (String[]args) {
		
		//call the method from different class: ClassName.MEthodName()
		
	System.out.println(Arrays.toString(CountArray.getArray()));	
		
		// store return value
	
	int [] nums = CountArray.getArray();
	
	System.out.println(Arrays.toString(nums));
	
	/**              **/
	
	System.out.println(Arrays.toString(getRandomArray(20)));
	
	
	//for (;;) { <= It gives infinite ~. (while it is true)
	//	System.out.println(Arrays.toString(getRandomArray(20)));
	//}
	
	int [] randomNums =  getRandomArray(3);
	System.out.println(Arrays.toString(randomNums));
		
	}
	
	public static int[] getRandomArray(int size) {
		Random rand = new Random();  // create object of random class
		
		int [] arr = new int [size]; // declare array with size(number of values)
		
		
		
		for (int i= 0; i<size;i++ ) {
			arr[i] = rand.nextInt(101); // get random num and assign to array index
		}
		return arr;
	}
	
	
	


}
