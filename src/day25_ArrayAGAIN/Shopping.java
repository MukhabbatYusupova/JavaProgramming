package day25_ArrayAGAIN;

public class Shopping {

	public static void main(String[] args) {
		
		String [] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch", "Gucci Bag", "Dior perfume"};
		double [] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int [] itemId = {12345, 12346, 12347, 12348, 12349};
		
		

		
		System.out.println("Products count:" + products.length);
		if (products.length == prices.length && products.length == itemId.length) {
		System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is not correct!");
		 
		return;
		}
		
		for (String prod: products) { // for each loop already knows the length of array
			System.out.println(prod);
		
	
		
		}
			System.out.println("#############");
	for (int i = 0; i<prices.length; i++) {
		System.out.println(prices [i]);
	}
	System.out.println( "############");
// print last item id
	System.out.println(itemId[itemId.length -1]);

	for (int i = itemId.length-1; i >=0; i--) {
		System.out.println(itemId[i]);
	}
	 System.out.println("##############");
	 
	 //print a report with total price
	 
	System.out.println("Your Shopping Receipt:"); 
	
	double totalPrice = 0.0;
for (int i = 0; i < products.length; i++) {
	System.out.println("Item "+(i+1)+": "+itemId[i]+ " - "+ products[i]+
			" - $"+prices[i]);
	totalPrice += prices[i];
	System.out.println("Total price: $"+ totalPrice);
}
System.out.println("################");
int maxIndex = 0;
double maxPrice = 0.0;

	for (int i = 0; i<prices.length; i++) {
		if (prices[i]>maxPrice) {
			maxPrice = prices[i];
			maxIndex = i;
		}
		

	}
	
	System.out.println(itemId[maxIndex]+ " - "+ products[maxIndex]+ " - $"+maxPrice);
	
	// find the min price!
	
	int minIndex=0;
	double minPrice = prices[0];
	
	for (int i=0; i <prices.length; i++) {
	if(minPrice > prices[i]) {
		minPrice = prices[i];
		minIndex= i;
		}
	}
	System.out.println("Minimum price: "+ minPrice+" "+ products[minIndex]+" and item: "+minIndex);
	
	
	}

}
