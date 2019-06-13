package day36_wrapperClasses_Arraylist01;

public class autoBoxing {

	public static void main(String[] args) {
		
//AutoBoxing;
		
		Integer num1 = 1234;
		int n =5;
		Integer num2 = n;
		
		//UNboxing
		Double d1 = new Double (34.2);
		double d2 = d1;
		
		System.out.println("d1 "+d1);
		System.out.println("d2 "+d2);
		
		long l1 = new Long(60000000); // unboxing
		Long l2 = new Long(345234567L); // normal
		long l3 = 12; //unboxing long->Long
		Long l4 = l3; // auto-boxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3;// casting is not possible with wrapper class
		

	}

}
