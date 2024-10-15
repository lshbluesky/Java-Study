package week07;

class Apple {
}

// Apple을 담을 수 있는 상품 클래스
class Goods1 {
	Apple apple;

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Pencil {
}

// Pencil을 담을 수 있는 상품 클래스
class Goods2 {
	Pencil pencil;

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class GenericTest1 {
	public static void main(String[] args) {
		// 사과를 저장하고 꺼내기
		Goods1 gs1 = new Goods1();
		gs1.setApple(new Apple());
		Apple ap = gs1.getApple();

		// 연필을 저장하고 꺼내기
		Goods2 gs2 = new Goods2();
		gs2.setPencil(new Pencil());
		Pencil pen = gs2.getPencil();
	}
}
