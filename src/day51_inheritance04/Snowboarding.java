package day51_inheritance04;

public class Snowboarding extends Exercise {
	
	@Override
	public int perform(int minutes) {
		int cal = super.perform(10);// call super class version of perform
		
		System.out.println("Snowboarding for " + minutes + " minutes");
			return 7 * minutes + cal; 
			}

}
