package week13;

abstract class GameCharacter {
	String name;
	int hp, mp;

	abstract void attack();

	abstract void defend();

	public GameCharacter() {
	}

	public GameCharacter(String name, int hp, int mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
}

class Worrior extends GameCharacter {
	public Worrior(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	@Override
	void attack() {
		System.out.println(name + "가 공격합니다.");
	}

	@Override
	void defend() {
		System.out.println(name + "가 방어합니다.");
	}
}

class Mage extends GameCharacter {
	public Mage(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	@Override
	void attack() {
		System.out.println(name + "가 마법 공격합니다.");
	}

	@Override
	void defend() {
		System.out.println(name + "가 마법 방어합니다.");
	}
}

public class RollMain {
	public static void main(String[] args) {
		GameCharacter w = new Worrior("전사", 150, 100);
		w.attack();
		w.defend();

		GameCharacter m = new Mage("마법사", 100, 150);
		m.attack();
		m.defend();

		GameCharacter gc = new GameCharacter("기본 캐릭터", 100, 100) {
			@Override
			void attack() {
				System.out.println(name + " 공격합니다.");
			}

			@Override
			void defend() {
				System.out.println(name + " 방어합니다.");
			}
		};
		gc.attack();
		gc.defend();
	}
}
