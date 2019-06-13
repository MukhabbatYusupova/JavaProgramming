package day59_polymorphism;

public class ShapeDemo {
	
	public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		shape1.draw();
		
		
		Shape circle = new Circle();
		circle.draw();
		System.out.println();
		Triangle tri = new Triangle();
		tri.draw();
		
		
		
	}

}
