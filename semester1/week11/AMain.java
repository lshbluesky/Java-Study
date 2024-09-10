package week11;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class AMain {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		A ac = new C();
		A ad = new D();
		
		// B ba = new A();
		B bb = new B();
		B bc = new C();
		B bd = new D();
		
		// C ca = new A();
		// C cb = new B();
		C cc = new C();
		// C cd = new D();
		
		// D da = new A();
		// D db = new B();
		// D dc = new C();
		D dd = new D();
	}
}
