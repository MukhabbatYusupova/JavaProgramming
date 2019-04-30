package day20_forLoop;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	for (int i = 1; i <=100; i++) {
		
		if(i%2==0) {
			System.out.print(i + " ");
			
		}
	}
		System.out.println();	
	for (int i =1; i <=100; i++) {
		if (i%2==1) {
			System.out.print(i + " ");
		}
	}
	System.out.println();
	int sumOfOdds=0;
	int sumOfEvens=0;
	
	for (int i = 1; i <=100; i++) {
		 if (i % 2==0) {
			 sumOfOdds+=i;
		 }else {
			sumOfEvens+=i;
		 }
	}
	
	System.out.println();
	System.out.println("Sum of odd number: "+ sumOfOdds);
	System.out.println("Sum of even numbers: " + sumOfEvens);
	
 System.out.print("Total: "+(sumOfOdds + sumOfEvens));
	}

}
