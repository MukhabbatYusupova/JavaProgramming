package day27_Array04;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		int [] time1 = new int [2];
		int[] time2 = new int[2];
		
		time1[0]=10;
		time1 [1]= 20;
		
		time2[0]=16;
		time2[1]=10;
		//time1 = {10,10}; <= doesnt work!!!
		
		/*int [] time1 = {20,45}
		 * int [] time2 ={13,30}
		 */
		
		
		// checking both time has valid hour and minute
		if (time1[0]<0 || time1[0]>23) {
			System.out.println("Time1 has invalid hour!");
			return; // get out from the code
		}else if (time1[1]<0 || time1[1]>59) {
			System.out.println("Time1 has invalid minute!");
			return; // get out from the code
		}
		if (time2[0]<0 || time2[0]>23) {
			System.out.println("Time2 has invalid hour!");
			return; 
		} else if (time2[1]<0 || time2[1]>59) {
			System.out.println("Time2 has invalid minute!");
			return; 
		}
		
		// compare arrays
		 if (time1[0] < time2[0]) {
			 System.out.println("Time1 is earlier");
		 } else if (time2[0]< time2[0]) {
			 System.out.println("Time2 is earlier");
		 } else {
			 if (time1[1] < time2[1]) {
				 System.out.println("Time 1 is erlier");
			 }else if (time2[1] < time1[1]) {
				 System.out.println("Time 2 is erlier");
			 }else {
				 System.out.println("Time is equal!");
			 }
		 }
		
		
		
		
//		int hour, minute, hour2, minute2;
//		int []time1={hour=scan.nextInt(), minute=scan.nextInt()};
//		int []time2={hour2=scan.nextInt(),minute2 = scan.nextInt() };
//		if (hour < 23 && hour < 0 && minute <0 && minute >59) {
//			System.out.println("Invalid time!");
//		} 
//		if(hour >hour2) {
//			if (minute> minute2){
//				System.out.println("Time1 is earlier");
//			}
//		}
//		 if (hour < hour2) {
//			if (minute < minute2) {
//				System.out.println("Time 2 is earlier");
//			}
//		}
//	if (hour == hour2) 
//	
//	
	
	
	}
	
	

}
