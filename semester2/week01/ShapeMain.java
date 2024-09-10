package week01;

abstract class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calcArea();
}

class Circle extends Shape {
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Rectangle extends Shape {
	private int width, height;

	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return width * height;
	}
}

class Triangle extends Shape {
	private int width, height;

	public Triangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return 0.5 * width * height;
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Circle myCircle = new Circle("동그라미", 9);
		System.out.println("※ 원의 넓이 : " + myCircle.calcArea());

		Shape myShape = new Rectangle("네모", 3, 2);
		System.out.println("※ 사각형 넓이 : " + myShape.calcArea());
		myShape = myCircle;
		System.out.println("※ 원의 넓이 : " + myShape.calcArea());

		Shape[] shapes = new Shape[3];
		shapes[0] = myCircle;
		shapes[1] = new Rectangle("직사각형", 5, 4);
		shapes[2] = new Triangle("정삼각형", 6, 6);

		Object[] objs = new Object[4];
		objs[0] = "Hello";
		objs[1] = myCircle;
		objs[2] = 100;
		objs[3] = shapes[1];

		Shape shapeObject = (Shape) objs[1];
		Shape shapeObject2 = (Shape) objs[3];

		System.out.println("※ 원의 넓이 : " + shapeObject.calcArea());
		System.out.println("※ 직사각형의 넓이 : " + shapeObject2.calcArea());
		System.out.println("※ 정삼각형의 넓이 : " + shapes[2].calcArea());
	}
}
