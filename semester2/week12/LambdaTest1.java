package week12;

@FunctionalInterface
interface A { // 입력X, 출력x
	void method1();
}

@FunctionalInterface
interface B { // 입력O, 출력x
	void method2(int a);
}

@FunctionalInterface
interface C { // 입력X, 출력O
	int method3();
}

@FunctionalInterface
interface D { // 입력O, 출력O
	double method4(int a, double b);
}

public class LambdaTest1 {
	public static void main(String[] args) {
		// 인터페이스 A를 구현하는 클래스의 객체 생성(익명 이너 클래스)
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("Method1 호출 - 익명 이너 클래스");
			}
		};
		a1.method1();

		// 람다식 사용
		A a2 = () -> System.out.println("Method1 호출 - 람다식");
		a2.method1();

		// 인터페이스 B를 구현하는 클래스의 객체 생성(익명 이너 클래스)
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("Method2 호출 - 익명 이너 클래스, a = " + a);
			}
		};
		b1.method2(1);

		// 람다식 사용
		B b2 = a -> System.out.println("Method2 호출 - 람다식, a = " + a);
		b2.method2(2);

		// 인터페이스 C를 구현하는 클래스의 객체 생성(익명 이너 클래스)
		C c1 = new C() {
			@Override
			public int method3() {
				return 3;
			}
		};
		System.out.println(c1.method3());

		// 람다식 사용
		C c2 = () -> 3;
		System.out.println(c2.method3());

		// 인터페이스 D를 구현하는 클래스의 객체 생성(익명 이너 클래스)
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {
				return a + b;
			}
		};
		System.out.println(d1.method4(1, 1.0));

		// 람다식 사용
		D d2 = (a, b) -> a + b;
		System.out.println(d2.method4(1, 1.0));
	}
}
