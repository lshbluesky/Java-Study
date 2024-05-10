package week10;

class A {
	int m = 3;

	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;

	void bcd() {
		System.out.println("B 클래스");
	}
}

public class TypeCasting {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();

		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();

		A ab = new B();
		System.out.println(ab.m);
		ab.abc();

		System.out.println();
		System.out.println(aa instanceof A); // true
		System.out.println(ab instanceof A); // true

		System.out.println(aa instanceof B); // false
		System.out.println(ab instanceof B); // true

		if (aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가!!!");
		}
		if (ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가!!!");
		}
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다");
		}
	}
}
