package day24_Array;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {
		
int[] lotteryNumbers = {12,45,3,62,42,90};

System.out.println(Arrays.toString(lotteryNumbers));
Arrays.parallelSort(lotteryNumbers);
System.out.println(Arrays.toString(lotteryNumbers));


//binary search works only with sorted array

int index = Arrays.binarySearch(lotteryNumbers, 90);
System.out.println("Position: " + index);

//Arrays.binarySearch(varialble,"value"));

	
	
	}

}
