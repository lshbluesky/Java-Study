package week13;

import java.util.*;
import java.util.stream.*;

class Streamflatmap {
	public static void main(String[] args) {

		Stream<String[]> strArrStrm = Stream.of(
			new String[]{"cat", "bird", "pig"},
			new String[]{"CAT", "DOG", "PIG"}
		);

//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

//		strStrmStrm
		strStrm.map(String::toLowerCase)  // 스트림의 요소를 모두 소문자로 변환
			   .distinct()
			   .sorted()
			   .forEach(System.out::println);
		System.out.println();

		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try",
		};

		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // 정규식
				  .map(String::toLowerCase)
				  .distinct()
				  .sorted()
				  .forEach(System.out::println);
		System.out.println();

		Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
		Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

		Stream<Stream<String>> strStrmStrm1 = Stream.of(strStrm1, strStrm2);

		Stream<String> strStream = strStrmStrm1
									.map(s -> s.toArray(String[]::new))  
		    						.flatMap(Arrays::stream);
		strStream.map(String::toLowerCase)
				 .distinct()
				 .forEach(System.out::println);
	}
}
