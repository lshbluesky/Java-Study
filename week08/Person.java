package week08;

public class Person { // 클래스 정의 틀 = 사용자 정의 클래스 자료형
	// 필드 = 속성 = 특징
	String name;
	int age;

	// 메소드 = 기능
	void talking() {
		System.out.println("Person can talk.");
	}
	void thinking() {
		System.out.println("Person can think.");
	}

	// 생성자 = 객체 생성 및 필드 초기화 기능 = 클래스의 이름과 동일
	public Person() {
		name = "Lee";
		age = 24;
	}
	
	public static void main(String[] args) {
		// Person 클래스로 p1, p2, p3 객체 생성
		Person p1 = new Person();
		
		// p1 객체의 메소드 호출
		p1.talking();
		p1.thinking();
	}
}
