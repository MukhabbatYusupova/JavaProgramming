package day54_inheritance06;

public class Capital  extends City {
	
	private int population;
	
	public int count = 1;
	
	public Capital (int id, String name, int population) {
		super(id, name);
		this.population = population;
	}
	public void desplayCount() {
		System.out.println("City count: "+ super.count);
		System.out.println("Capital count: " + count);
	}
	
	public static void buildARoad() {
		System.out.println("Capital City - building a road");
	}
@Override
public String toString() {
	return super.toString()+ " population: "+ population+ " sub count:" + count;
	
}
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
