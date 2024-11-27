package week12.Q6;

interface A {
	B abc(int a, double b);
}

class B {
	B() {
		System.out.println("첫 번째 생성자");
	}

	B(int a) {
		System.out.println("두 번째 생성자");
	}

	B(int a, double b) {
		System.out.println("세 번째 생성자");
	}
}

public class Ch18_Q6 {
	public static void main(String[] args) {
		A a = B::new;
		B b = a.abc(5, 3.14);
		System.out.println(b);
	}
}
