package day54_inheritance06;

public class HidingTest {
	
	public static void main(String[] args) {
		
		City city= new City(345, "London");
		Capital cap = new Capital(4, "Paris", 12345);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		
		cap.desplayCount();
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(12, "Vienna");
		Capital cap2 = new Capital(12, "Tashkent", 30000);
		
		city2.letsBuildTheRoad();
		cap2.letsBuildTheRoad();
		
		
	}

}
