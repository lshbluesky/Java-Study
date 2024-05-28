package week13;

interface A3 {
	int number = 10;
	String name = "No Name";

	int sum(int x, int y);
}

interface B3 {
	public static final int age = 20;

	public abstract int getAge();
}

class C implements A3, B3 {
	public int sum(int x, int y) {
		return x + y;
	}

	public int getAge() {
		return 20;
	}
}

public interface InterfaceTest1 {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.sum(10, 20));
	}
}
