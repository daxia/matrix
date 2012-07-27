package designprinciples.OCP;

//ocp
//open-close principle

// you can implements the interface 
//and the other concretes are not changes
public class OCP_Shape {

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		shape1.getName();
		shape1.draw();
		
		Shape shape2 = new Triangle();
		shape2.getName();
		shape2.draw();
	}

}

interface Shape {
	public void getName();

	public void draw();
}

class Circle implements Shape {
	public void getName() {
		System.out.println("This is a Circle!");
	}

	public void draw() {
		System.out.println("Draw Circle!");
	}
}

class Triangle implements Shape {
	public void getName() {
		System.out.println("This is a Triangle!");
	}

	public void draw() {
		System.out.println("Draw Tiangle!");
	}
}
