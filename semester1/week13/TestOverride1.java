package week13;

class Shape {
	void draw() {
		System.out.println("Drawing a shape.");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle.");
	}
}

public class TestOverride1 {
	public static void main(String[] args) {
		Shape c = new Circle();
		c.draw();
	}
}
