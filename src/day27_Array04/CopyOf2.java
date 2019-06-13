package day27_Array04;
import java. util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		int[]nums1= {34, 56, 23, 1, 55};
		int [] nums2 = Arrays.copyOf(nums1, nums1.length+2); // copying and adding 2 more spots
		
		System.out.println(Arrays.toString(nums2));
		nums2[nums2.length-2]= 2;
		nums2[nums2.length-1]= 5;
		System.out.println(Arrays.toString(nums2));
		
		
		//
		
		int [] nums3 = Arrays.copyOfRange(nums1, 1, 3);
		System.out.println(Arrays.toString(nums3));  // cut till 3rd character
		
		
		
		int [] brandNew =  {34, 23, 54, 23};
		System.out.println("Length before: " + brandNew.length);
		
		brandNew = Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println("Length before: " + brandNew.length);
		
		
		
	}

}
