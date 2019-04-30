package day19_DoWhileloops;

public class doWhile {

	public static void main(String[] args) {


		int i=1;
		do {
			System.out.println(i);  // prints 1 
			i++;                    // add 1 to 1
		} while (i <=10);           // checks 2 is less than 10? true goes back to up prints again checks
		
		int sum =0;
		int j = 1;
		
		
		do {
			sum = sum+j; // sum+=j;
			j++;	
			
		} while (j<=5);
		System.out.println(sum);
		

	}

}
