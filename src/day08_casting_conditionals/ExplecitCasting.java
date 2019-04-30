package day08_casting_conditionals;

public class ExplecitCasting {

	public static void main(String[] args) {
	 
		
		
		System.out.println(10/2.0); //it prints double type. java takes bigger amount type into account
		
		int result = (int)(10/2.0); 
		
		int rent1 = 987;
		int rent2 =1100;
		int rent3 =894;
		int rent4 = 1234;
		double avarage = (rent1+rent2+rent3+rent4)/4; // if you wanna get exact amount u have to add .0
	
		System.out.println(avarage);
		
		double avarage1 = (double)(rent1+rent2+rent3+rent4)/4;
		System.out.println(avarage1);
		
		double avarage2 = (rent1+rent2+rent3+rent4)/4.0;
		System.out.println(avarage2);
		
		double d =40.2;
		int i = (byte)d; // 2 actions are happening: first double into byte using explicit casting 
		                 // byte into int automatically implicit
		
		
		
				}

}
