package week09.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> score = new HashSet<>();
		score.add(11);
		score.add(22);
		score.add(11);
		System.out.println(score);
		
		// 과일을 저장하는 Set<E> 컬렉션 fruit 정의
		Set<String> fruit = new HashSet<>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Melon");
		System.out.println(fruit);
	}
}
