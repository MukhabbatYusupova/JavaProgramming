package day54_inheritance06;

public class City {
	
	private int id;
	private String name;
	
	public int count = 10;
	
	public City(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void buildARoad() {
		System.out.println("City - building a road");
	}
	
	
	public void letsBuildTheRoad() {
		buildARoad();
	}
	@Override
	
	public String toString() {
		return "id: "+ id + " Name: " + name+ " count: "+ count;
		
	}
	
	
	
	@Override
	
	public boolean equals(Object obj) {
		City anotherCity = (City) obj;
		
		if (this.id == anotherCity.id &&
				this.name.contentEquals(anotherCity.name)) {
			return true;
		}
		return false;
			
	}
	
	public int hashCode() {
		return id + name.length();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
