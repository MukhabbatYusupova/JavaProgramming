package day42_customClasses_encapsulation;

public class Coffee {
	
	String name;
	String size;
	double price;
	int cal;
	
	public void getCoffeeInfo() {
		System.out.println("Name: "+name.toUpperCase()+" Size: "+ size.toUpperCase()+ " Price: $"+price+ " Calories "+ cal+"cal.");
	}
	
	public void setName(String newName) {
		name =newName;
	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("tall")||
				newSize.equalsIgnoreCase("grande")||
				newSize.equalsIgnoreCase("venti")) {
			size =newSize;
		} else {
			size = "unknown";
			System.out.println("Invalid size - " + newSize);
			
		}
		
		}
	
	public void setPrice(double newPrice) {
		price =newPrice;
	}
	
	public void setCal(int newCal) {
		cal =newCal;
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
	
		
		name = newName;
		setSize(newSize);
		price = newPrice;
		cal = newCal;
		
		
	}
	
}
