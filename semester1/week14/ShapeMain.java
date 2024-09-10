package week14;

abstract class Shape {
	abstract double calArea();
	abstract double calPerimeter();
}

class Circle extends Shape {
	private double radius;

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double calArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double calPerimeter() {
		return 2 * Math.PI * radius;
	}

	void showAreaAndPerimeter() {
		System.out.println("▦ Circle 면적 : " + calArea());
		System.out.println("▦ Circle 둘레 : " + calPerimeter());
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;

	Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double calArea() {
		return width * height;
	}

	@Override
	double calPerimeter() {
		return 2 * width + 2 * height;
	}

	void showAreaAndPerimeter() {
		System.out.println("▦ Rectangle 면적 : " + calArea());
		System.out.println("▦ Rectangle 둘레 : " + calPerimeter());
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.showAreaAndPerimeter();

		Rectangle rect = new Rectangle(10, 20);
		rect.showAreaAndPerimeter();
	}
}
