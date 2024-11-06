package week10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	// 중복을 검토하는 메소드 정의 필요
	// hashCode() + equals() 둘 다 정의되어 있어야 함
}

public class SetTest {
	public static void main(String[] args) {
		Set<A> aSet = new HashSet<>();
		aSet.add(new A());
		aSet.add(new A());
		aSet.add(new A());
		System.out.println("aSet 컬렉션 요소의 개수 : " + aSet.size());
		System.out.println(aSet);

		Set<String> setStuff = new HashSet<>();
		setStuff.add("Book");
		setStuff.add("Monitor");
		setStuff.add("Computer");
		setStuff.add("Mouse");
		setStuff.add("USB");

		System.out.println("setStuff 컬렉션 요소의 개수 : " + setStuff.size());
		System.out.println(setStuff);
		Iterator<String> iter = setStuff.iterator();
		while (iter.hasNext()) // setStuff 컬렉션에서 접근하지 않은 요소에 하나씩 접근
			System.out.println(iter.next());
	}
}
