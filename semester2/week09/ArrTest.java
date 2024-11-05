package week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrTest {
	public static void main(String[] args) {
//		String[] animal = new String[] { "개", "고양이", "새", "햄스터", "토끼" };
//		System.out.println(animal.length);
//
//		for (String k : animal) {
//			System.out.println(k);
//		}
//
//		System.out.println(Arrays.toString(animal));
//		System.out.println("Animal 개수 : " + animal.length);
//
//		animal[4] = null;
//		System.out.println(Arrays.toString(animal));

		// List<E> 인터페이스를 구현한 클래스 이용
		List<String> fruit = new ArrayList<String>(20);
		List<String> fruit2 = new Vector<String>(20);
		List<String> fruit3 = new LinkedList<String>();
		System.out.println("과일 개수 : " + fruit.size());

		// 추가 및 개수 조회
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Mango");
		fruit.add("Lemon");
		fruit.add("Banana");
		System.out.println(fruit);
		System.out.println(fruit.toString());
		System.out.println("과일 개수 : " + fruit.size());

		// 삭제
		fruit.remove(4);
		fruit.remove("Banana");
		System.out.println(fruit);

		// 변경
		fruit.set(3, "Strawberry");
		System.out.println(fruit);

		// 지정한 위치에 추가
		fruit.add(1, "AppleMango");
		System.out.println(fruit);

		// addAll()
		fruit.addAll(fruit);
		System.out.println(fruit);
		System.out.println("-".repeat(50));

		// fruit 리스트를 배열로 변환하고 출력
		Object[] obj = fruit.toArray();
		System.out.println(Arrays.toString(obj));

		// String[0]에서 0의 의미는 실제로 저장 공간을 0개로 명시하는 것이 아니라, 단지 배열의 타입의 String 인 것을 알려주기 위함
		String[] str = fruit.toArray(new String[0]);
		System.out.println("str[1] : " + str[1]);

		String[] str2 = fruit.toArray(new String[15]);
		System.out.println(Arrays.toString(str2));

		// fruit 리스트 안의 모든 요소를 삭제하기
		fruit.clear();
		System.out.println(fruit);

		// isEmpty() 확인
		System.out.println(fruit.isEmpty());

		// asList() 는 리스트같은 배열(크기 조절 불가)
		List<Integer> alist = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(alist);
	}
}
