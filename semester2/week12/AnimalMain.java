package week12;

// 함수형 인터페이스 : 단 하나의 추상 메소드만 존재하는 인터페이스
@FunctionalInterface
interface Animal {
	abstract void cry(); // 추상 메소드

	default void eat() {
		System.out.println("Something eat.");
	};
}

@FunctionalInterface
interface Maxible {
	abstract int max(int a, int b);
}

class Cat implements Animal {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}

class Dog implements Animal {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.cry();

		Animal cat2 = new Cat();
		cat2.cry();

		// 익명 이너 클래스 - Cat 클래스를 사용하지 않고 객체 생성
		Animal cat3 = new Animal() {
			@Override
			public void cry() {
				System.out.println("야옹");
			}
		};
		cat3.cry();

		// 람다식으로 표현
		Animal cat4 = () -> System.out.println("야옹야옹");
		cat4.cry();

		Maxible max = (a, b) -> a > b ? a : b;
		int number = max.max(7, 10);
		System.out.println(number);
	}
}
