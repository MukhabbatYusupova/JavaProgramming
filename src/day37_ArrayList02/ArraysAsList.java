package day37_ArrayList02;
import java.util. *;
public class ArraysAsList {

	public static void main(String[] args) {
		
		List<String> cars = Arrays.asList("Tesla","Fiat");
		
		List<Integer> nums = Arrays.asList(2,3,4,6,7);
		System.out.println(nums.size());
		System.out.println(nums);
		//nums.add(100);  u can not modify cuz it becomes fixed
		
		List<Double> prices = Arrays.asList(9.99, 5.99, 10.05, 25.00, 15.05,
                100.02, 1255.05, 364.10, 105.2, 200.9);
		double sum =0;
		
		for(double price: prices) {
			sum+=price;
		}
		System.out.println("Sum: " + sum);
		
		
		double sum2 = 0;
		
		for (int i=0; i<prices.size(); i++) {
			sum2+=prices.get(i);
		}
		System.out.println("Sum2 " + sum2);
		
	List <Double> expensive = new ArrayList<>();
	
	for (double price: prices) {
		if (price>100.0) {
			expensive.add(price);
		}
	}
	 System.out.println("Expencive "+ expensive);
	// prices.removeAll(expensive);
	 System.out.println("Prices "+ prices);
		
		
		
		
	}

}
