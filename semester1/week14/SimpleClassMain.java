package week14;

abstract class SimpleClass {
	abstract void myClassName();
}

class Temp extends SimpleClass {
	@Override // 자식 클래스에서 추상 메소드 구현
	void myClassName() {
		System.out.println("추상 클래스 이름 : " + SimpleClass.class.getSimpleName());
	}
}

public class SimpleClassMain {
	public static void main(String[] args) {
		// 익명 이너 클래스로 객체 생성
		SimpleClass sc = new SimpleClass() {
			@Override // 추상 메소드 구현
			void myClassName() {
				System.out.println("추상 클래스 이름 : " + this.getClass().getSimpleName()); // 클래스 이름 출력 X
				System.out.println("추상 클래스 이름 : " + SimpleClass.class.getSimpleName()); // 클래스 이름 출력 O
			}
		};
		sc.myClassName();
		
		// 자식 클래스를 만들어서 객체 생성
		Temp t = new Temp();
		t.myClassName();
	}
}
