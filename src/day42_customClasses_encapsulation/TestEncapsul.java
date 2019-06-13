package day42_customClasses_encapsulation;

public class TestEncapsul {
	
	public static void main(String[] args) {
		
		practiceEncapsul encaps1 = new practiceEncapsul();
		
		encaps1.setName("Jim");
		encaps1.setAge(17);
		
		System.out.println(encaps1.getName());
		
		 encaps1.setScore(80);
		 
		 System.out.println(encaps1.getScore());
		 
		 
	}

}
