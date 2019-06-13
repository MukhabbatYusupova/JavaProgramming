package day27_Array04;

import java.util.Arrays;

public class ArraysEquals1 {

	public static void main(String[] args) {
		
int [] num1 = {4,5,6,10,100};
int [] num2 = {4,5,6,10,100};

System.out.println(Arrays.equals(num1, num2)); // true

if(Arrays.equals(num1, num2)) {  // nums should be same index to index
	System.out.println("they are same!");
} else {
	System.out.println("mismatched index!");  
}
int [] num3 = {4,5,6,10,100};
int [] num4 = {4,5,6,10,100, 200}; // <= length mismatch

System.out.println(Arrays.equals(num3, num4)); // false

// String

String [] strArr1 = {"one", "two", "Three"}; // uppercase T
String [] strArr2 = {"one", "two", "three"};// lowercase t == false

System.out.println(Arrays.equals(strArr1, strArr2));// false

boolean match = Arrays.equals(strArr1, strArr2);

System.out.println("It is match: " + match);


	}

}
