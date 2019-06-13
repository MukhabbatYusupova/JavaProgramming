package day27_Array04;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		
double[]d1 = {2.3, 4.5, 12.4};
 double [] d2 = d1;
 System.out.println(Arrays.toString(d1));
 System.out.println(Arrays.toString(d2));
 // when we change any value of d1, d2 also changes
 d1[0] = 1000.3;
 System.out.println(Arrays.toString(d1));
 System.out.println(Arrays.toString(d2));

 d2[1]= 19.99;
 
 System.out.println(Arrays.toString(d1));
 System.out.println(Arrays.toString(d2));
	
	System.out.println("##########");
	
	double[] d3 = Arrays.copyOf(d2, d2.length); // why length?
	
	System.out.println(Arrays.toString(d3));
	
	d3[2]=11.11;
	System.out.println(Arrays.toString(d3));
	
	
	
	
	
	}

}
