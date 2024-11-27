package week12.Q1;

interface A {
	double abc(int k);
}

class B {
	double bcd(int k) {
		return k * 0.1;
	}
}

public class Ch18_Q1 {
	public static void main(String[] args) {
//		A a = new A() {
//			@Override
//			public double abc(int k) {
//				B b = new B();
//				return b.bcd(k);
//			}
//		};

//		A a = (k) -> {
//			B b = new B();
//			return b.bcd(k);
//		};

		B b = new B();
		A a = b::bcd;
		System.out.println(a.abc(100));
	}
}
