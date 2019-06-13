package day43_encapsulation_constructors;

public class MicroCenter {
	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		
		
		comp1.setBrand("MacBook Pro");
		comp1.setOs("macOs High Sierra");
		comp1.setPrice(2576);
		
		
		comp2.setBrand("Dell");
		comp2.setOs("Windows");
		comp2.setPrice(500);
		
		System.out.println(comp1);
		System.out.println(comp2);
		
		
		Computer comp3 = new Computer("Asus", "Windows 7", 500.50);
		
		System.out.println(comp3);
		
		comp3.setOs("Windows 11");
		
		System.out.println(comp3);
		
		comp3.setPrice(comp3.getPrice()-200);
		System.out.println(comp3);
		
		
		
	}

}
