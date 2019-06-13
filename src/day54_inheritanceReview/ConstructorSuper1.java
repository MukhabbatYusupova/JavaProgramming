package day54_inheritanceReview;

class Animals{
	public Animals() {
		System.out.println("Tiger");
	}
	
}

public class ConstructorSuper1 extends Animals{
	
	public ConstructorSuper1() {
		super();
	}
	
	public ConstructorSuper1(int a) {
		super();
	}
	public ConstructorSuper1(double a) {
		super();
	}

	public static void main(String[] args) {
		new ConstructorSuper1(10.5);
	}
	//* adf*/

}
