package day25_ArrayAGAIN;

public class Population {

	public static void main(String[] args) {
		

		int[] population = new int[5];
		population[0] = 5000;
		population[1] = population[0] * 2;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;

//int [] population = {5000, 5000*2, 7000, 4455, 8907}

		

		int idx = 0;
		System.out.println("Population 0: " + population[idx]);
		idx++;
		System.out.println("Population 1: " + population[idx]);
		
		
		
		String str = "abc";
		System.out.println("Population str.lenth():" + population[str.length()]);
		
		// 
		
		String [] cities = {"Tashkent", "London", "Rome", "New York", "Baku"};
		
		System.out.println("Population of "+cities[0]+ " is " + population[0]);
		System.out.println("Population of "+cities[1]+ " is " + population[1]);
		System.out.println("Population of "+cities[2]+ " is " + population[2]);
		System.out.println("Population of "+cities[3]+ " is " + population[3]);
		System.out.println("Population of "+cities[4]+ " is " + population[4]);
		
		
		for (int i =0; i<5; i++) {
		
			

		
		
		}
	}

}
