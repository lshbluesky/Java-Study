package week12.Q7;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {
		System.out.println(k);
	}
}

public class Ch18_Q7 {
	public static void main(String[] args) {
		A a = B::bcd;
		B b = new B();
		a.abc(b, 3); // 3
	}
}
