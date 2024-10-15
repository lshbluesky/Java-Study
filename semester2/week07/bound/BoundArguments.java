package week07.bound;

class A {
}

class B extends A {
}

class C extends B {
}

class D extends C {
}

class Goods3<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Test { // 메소드 매개변수의 타입 제한 예제
	void method1(Goods3<A> g) {
	} // 변수 g의 타입은 클래스 A만 가능

	void method2(Goods3<?> g) {
	} // 변수 g의 타입은 A, B, C, D 모두 가능

	void method3(Goods3<? extends B> g) {
	} // 변수 g의 타입은 B, C, D 가능

	void method4(Goods3<? super B> g) {
	}  // 변수 g의 타입은 A, B 가능
}

public class BoundArguments {
	public static void main(String[] args) {
		Test t = new Test();

		// #1. Case1. method1(Goods3<A> g)
		t.method1(new Goods3<A>()); // O
//		t.method1(new Goods3<B>()); // X
//		t.method1(new Goods3<C>()); // X
//		t.method1(new Goods3<D>()); // X

		// #2. Case2. method2(Goods3<?> g)
		t.method2(new Goods3<A>()); // O
		t.method2(new Goods3<B>()); // O
		t.method2(new Goods3<C>()); // O
		t.method2(new Goods3<D>()); // O

		// #3. Case3. method3(Goods3<? extends B> g)
//		t.method3(new Goods3<A>()); // X
		t.method3(new Goods3<B>()); // O
		t.method3(new Goods3<C>()); // O
		t.method3(new Goods3<D>()); // O

		// #4. Case4. method4(Goods3<? super B> g)
		t.method4(new Goods3<A>()); // O
		t.method4(new Goods3<B>()); // O
//		t.method4(new Goods3<C>()); // X
//		t.method4(new Goods3<D>()); // X
	}
}
