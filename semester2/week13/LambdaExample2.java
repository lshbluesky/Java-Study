package week13;

import java.util.Arrays;
import java.util.List;

public class LambdaExample2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// 1-1. 일반적인 방법 - for each 반복문 사용
		for (String k : names) {
			System.out.println(k);
		}

		// 1-2. 일반적인 방법 - toString() 메소드 사용
		System.out.println(names.toString());

		// 2. 람다식 이용
		names.forEach(s -> System.out.println(s));

		// 3. 메소드 참조 이용
		names.forEach(System.out::println);
	}
}
