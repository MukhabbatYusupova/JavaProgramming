package day55_abstraction;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(10);
		
		System.out.println("Calculated area of circle: "+c1.calculateArea());
		c1.draw();
		System.out.println();
		
		Triangle t1 = new Triangle(5,5,5);
		System.out.println("Area: "+ t1.calculateArea());
		t1.draw();
	}

}
