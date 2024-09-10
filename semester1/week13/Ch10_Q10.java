package week13;

class A2 {
	A2() {
		System.out.println("A 생성자 1");
	}

	A2(int a) {
		this();
		System.out.println("A 생성자 2");
	}
}

class B2 extends A2 {
	B2() {
		System.out.println("B 생성자 1");
	}

	B2(int a) {
		super(a);
		System.out.println("B 생성자 2");
	}
}

public class Ch10_Q10 {
	public static void main(String[] args) {
		B2 bb = new B2(5);
	}
}
