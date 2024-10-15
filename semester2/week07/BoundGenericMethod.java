package week07;

class A {
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface {
	public abstract void print();
}

class B {
	public <T extends MyInterface> void method1(T t) {
		// method1에서 T 타입은 MyInterface를 구현한 클래스로 제한하겠다는 의미
		t.print();
	}
}

public class BoundGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method1(3.14); // Double 클래스는 Number 크래스의 하위 클래스이므로 가능
		// a.method1("abc"); 불가능
		
		B b = new B();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("MyInterface 구현");
			}
		});
	}
}
