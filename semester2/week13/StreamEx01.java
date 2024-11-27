package week13;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(arr);
		
		String[] strArr = { "Bird", "Bird", "Flower", "Fire", "Ice", "Apple", "Tree" };

//		Stream<String> stream = Stream.of(strArr);
//		Stream<String> filteredStream = stream.filter(s -> s.length() >= 5);
//		Stream<String> distinctedStream = filteredStream.distinct();
//		Stream<String> sortedStream = distinctedStream.sorted();
//		Stream<String> limitedStream = sortedStream.limit(3);
//		long total = limitedStream.count();
//		System.out.println(total);
		
		Stream<String> stream = Stream.of(strArr)
		                              .filter(s -> s.length() >= 5)
		                              .distinct()
		                              .sorted()
		                              .limit(3);
		long total = stream.count(); // 최종 연산
		System.out.println(total); // 2
		
//		stream.forEach(System.out::println); // Apple, Flower
	}
}
