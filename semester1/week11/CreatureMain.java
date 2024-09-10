package week11;

class Creature {
	String kinds, name;

	Creature() {
		this.kinds = null;
		this.name = null;
	}

	Creature(String... s) {
		this.kinds = s[0];
		this.name = s[1];
	}

	void showInfo() {
		System.out.println("▦ 분류 : " + kinds);
	}
}

class Plants extends Creature {
	String where;

	Plants(String... s) {
		super(s[0], s[1]);
		this.where = s[2];
	}

	@Override // Annotation, 컴파일러에게 메소드 오버라이딩을 검증해달라는 역할을 함.
	void showInfo() {
		super.showInfo();
		System.out.println("▦ 이름 : " + name + "       ▦ 사는 곳 : " + where);
		System.out.println();
	}
}

class Animal extends Creature {
	String feed;

	Animal(String... s) {
		super(s[0], s[1]);
		this.feed = s[2];
	}

	@Override // Annotation, 컴파일러에게 메소드 오버라이딩응 검증해달라는 역할을 함.
	void showInfo() {
		super.showInfo();
		System.out.println("▦ 이름 : " + name + "       ▦ 먹이 : " + feed);
		System.out.println();
	}
}

public class CreatureMain {
	public static void main(String[] args) {
		Plants p = new Plants("장미과 식물", "장미", "식물원");
		Animal a = new Animal("가금형 동물", "돼지", "사료 외");

		System.out.println("----- Plants 클래스 p객체 정보 출력 -----");
		p.showInfo();
		System.out.println("----- Animal 클래스 a객체 정보 출력 -----");
		a.showInfo();
	}
}
