package day27_ArrayArray;
import java.util.*;
public class ArraysSort {

	public static void main(String[] args) {
		
int [] nums = {43,12,4,1,3,5};


//toString

Arrays.toString(nums);

String str = Arrays.toString(nums);

System.out.println(str);


//sort method -  ascending order, 123.. abc..


Arrays.sort(nums); // u can not just print it out using like that
System.out.println(Arrays.toString(nums));


String [] languages = {"Zulu", "Spanish", "Italian","Arabic", "English", "Uzbek"};
System.out.println(Arrays.toString(languages));

Arrays.sort(languages); // when u see "void" when u bring mouse, it doesnt return anything
                        // so u can not print out right away

System.out.println(Arrays.toString(languages));




int []nums2 = {345, 665, 3333, 11, 3, 66};

Arrays.parallelSort(nums2);

System.out.println(Arrays.toString(nums2));

int lowest = nums2[0];
int largest= nums2[nums2.length-1];

System.out.println("Lowest num: "+ lowest);
System.out.println("Largest num: " + largest);



	}

}
