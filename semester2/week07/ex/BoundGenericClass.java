package week07.ex;

class A {
}

class B extends A {
}

class C extends B {
}

class D<T extends B> { // T 타입으로 클래스 B, C 사용 가능(String, Integer 불가능)
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class BoundGenericClass {
	public static void main(String[] args) {
		// D<A> d1 = new D<>(); 불가능
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); // D<B> d2 = new D<>(); 와 동일

		d2.set(new B());
		d2.set(new C());

		d3.set(new C());
		// d3.set(new B());

		d4.set(new B());
		d4.set(new C());
	}
}
