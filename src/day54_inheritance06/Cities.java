package day54_inheritance06;

public class Cities {
	
	public static void main (String [] smth) {
		
		City Baku = new City (123, "Baku");
		System.out.println(Baku.toString());
		
		City Istambul = new City (456, "Istambul");
		City anotherCity = new City (456, "Istambul");
		
		if(Istambul.equals(anotherCity)) {
			System.out.println("same city");
		} else {
			System.out.println("not same");
		}
		
		
		
		System.out.println(Baku.hashCode());
		System.out.println(Istambul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washington Dc", 800_000);
		System.out.println(cap.toString());
		
		
		
	}

}
