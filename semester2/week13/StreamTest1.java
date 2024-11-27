package week13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		IntStream intstm = Arrays.stream(new int[] {1, 2, 3});
		Stream<Integer> intStream = list.stream(); // Stream<T> Collection.stream()

		// 스트림의 모든 요소를 출력
		intStream.forEach(System.out::print); // 12345 메소드 참조 최종연산

		intStream = list.stream();
		intStream.forEach(System.out::print); // 위의 코드가 없으면 오류 발생(스트림이 이미 닫힘)

		Stream<String> strStream = Stream.of(new String[] { "cat", "bird", "apple", "mouse" });
//		Stream<String> strStream = Stream.of({"cat", "bird", "apple", "mouse"});  // 불가
		strStream.forEach(System.out::println);

		String[] strArr = new String[] { "cat", "bird", "apple", "mouse", "컵" };
		strStream = Stream.of(strArr);
		strStream.forEach(System.out::println);

		strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);

//		int[] intArr = {1,2,3,4,5};
		Integer[] intArr = { 1, 2, 3, 4, 5 }; // {new Integer(1), new Integer(2), ... }
		Stream<Integer> intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::print);  // 최종연산
//		System.out.println("count = " + intStream2.sum());  // 오류 : Stream<Integer>은 sum() 미제공
		System.out.println("count = " + intStream2.count());

		int[] intArr2 = { 1, 2, 3, 4, 5 };
		IntStream intStream3 = Arrays.stream(intArr2);
		System.out.println("count = " + intStream3.count());
	}

}
