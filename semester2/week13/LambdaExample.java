package week13;

@FunctionalInterface // 하나의 추상 메소드를 가지는 인터페이스
interface Adder {
	int add(int a, int b); // a.add(1, 2) 와 같이 호출
}

public class LambdaExample {
	public static void main(String[] args) {
		Adder adder1 = new Adder() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		int sum = adder1.add(1, 2);
		System.out.println(sum);

//		Adder adder2 = (int a, int b) -> { return a + b; };
		Adder adder2 = (a, b) -> a + b;
		System.out.println(adder2.add(3, 5));
	}
}
