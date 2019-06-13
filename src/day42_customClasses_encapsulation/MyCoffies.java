package day42_customClasses_encapsulation;

public class MyCoffies {
	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		
		coffee1.name = "iced cramel macchiato";
		coffee1.size = "grande";
		coffee1.price = 4.75;
		coffee1.cal =150;
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("java chip");
		coffee2.size = "venti";
		coffee2.price = 5.95;
		coffee2.cal =600;
		
		coffee2.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		
		coffee3.setName("iced coffee");  // == coffee3.name = "iced coffee";
		coffee3.setSize("small"); // incorrect size
		coffee3.setPrice(2.45);
		coffee3.setCal(60);
		
		coffee3.getCoffeeInfo();
		
		coffee3.setSize("tall"); // corrected
		
		coffee3.getCoffeeInfo();
		
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("flat white", "tall", 3.95, 170);
		
		coffee4.getCoffeeInfo();
		
	}

}
