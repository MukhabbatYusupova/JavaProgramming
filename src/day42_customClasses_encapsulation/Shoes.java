package day42_customClasses_encapsulation;

public class Shoes {
	
	String brand;
	double size;
	
	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
		
		
	}
	
	public String getShoesData() {
		return brand + " | "+ size;
	}

}
