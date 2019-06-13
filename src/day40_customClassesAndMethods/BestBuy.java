package day40_customClassesAndMethods;

public class BestBuy {

	public static void main(String[] args) {
		// System.out.println(brand);   <== this line will not work, we need object to use brand
		// Create a CellPhone object
		
		CellPhone cell1 = new CellPhone();
		
		System.out.println(cell1.brand); // null
		System.out.println(cell1.screenSize); // 0.0
		
		System.out.println("###OBJECT1###");
		cell1.brand = "Nokia6300";
		cell1.screenSize =2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: "+ cell1.brand);
		System.out.println("ScreenSize: "+ cell1.screenSize);
		System.out.println("color: "+ cell1.color);
		System.out.println("Price: " + cell1.price);
		
		System.out.println();
		System.out.println("###OBJECT2###");
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		System.out.println("Brand: "+ cell2.brand);
		System.out.println("ScreenSize: "+ cell2.screenSize);
		System.out.println("color: "+ cell2.color);
		System.out.println("Price: " + cell2.price);
		
		
		cell1.call();
		cell1.message();
		cell1.takePhoto();
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
		
	}


		
}
