package day55_abstraction;

public abstract class Shape {
	
	public String name;
	public double area;
	
	
	public Shape(String name) {
		this.name= name;
	}
	
	public abstract double calculateArea();
	
	
	public abstract void draw();
	


}
// sub class


class Circle extends Shape{

		double radius;
		
	public Circle() {
		super("Circle");
}
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
		
	}

	@Override
	public double calculateArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		System.out.println("    * * *    \n" + 
				" *         * \n" + 
				"*           *\n" + 
				"*           *\n" + 
				"*           *\n" + 
				" *         * \n" + 
				"    * * *  ");
		
	}
	
}

// sub class

class Triangle extends Shape{

	double leng1,leng2,leng3;
	
	public Triangle() {
		super("Triangle");
		
	}
	public Triangle(double leng1, double leng2, double leng3) {
		super("Triangle");
		this.leng1 = leng1;
		this.leng2 = leng2;
		this.leng3 = leng3;
		
	}

	@Override
	public double calculateArea() {
		double p = (leng1 + leng2 + leng3)/2;
		return Math.sqrt(p*(p-leng1)*(p-leng2)*(p-leng3));
		
	}

	@Override
	public void draw() {
		System.out.println("     *  \n" + 
				"    ***\n" + 
				"   *****\n" + 
				"  *******\n" + 
				" *********");
		
	}

	

}
class ShapeDraw{
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		
		c1.draw();
		t1.draw();
	
}
}
