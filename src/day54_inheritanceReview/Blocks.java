package day54_inheritanceReview;

public class Blocks {
	
	 static String names;
	
	static {
		names = "John";
		
	}
	
	{
		names =  "Aaron";
	}
	
	public Blocks() {
		names= "Mike";
	}
	
	
	public static void main(String[] args) {
		System.out.println(names);
		
		Blocks obj1 = new Blocks();
		System.out.println(obj1.names);
		
		
	}

}
