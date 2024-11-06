package week10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class AA {
	int data;

	public AA(int data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // this는 a1, obj는 a2, 주소가 다르므로 false
			return true;
		if (obj == null) // false
			return false;
		if (getClass() != obj.getClass()) // false
			return false;
		AA other = (AA) obj;
		return data == other.data; // 5 == 5 이므로 true
	}
}

public class HashSetMachanism {
	public static void main(String[] args) {
		Set<AA> aSet = new HashSet<>();
		AA a1 = new AA(5);
		AA a2 = new AA(5);
		System.out.println(a1 == a2); // false
		System.out.println(a1.equals(a2)); // false, 최상위 Object 클래스의 equals() 메소드 호출, == 와 동일, 오버라이딩 후에는 true 출력
		System.out.println(a1.hashCode() + "::" + a2.hashCode()); // 서로 다름

		aSet.add(a1);
		aSet.add(a2);
		System.out.println(aSet.size()); // 저장된 필드의 값은 5로 같지만, 서로 다른 객체로 인식하여 2를 출력, 오버라이딩 후에는 1을 출력
	}
}
