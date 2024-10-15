package week07.ex;

class Apple {
}

class Pencil {
}

// Apple, Pencil 모두 담을 수 있는 상품 제네릭 클래스 Goods<T>
class Goods<T> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

// 제네릭 인터페이스
interface Basket<T> {
	void putIn(T something);
}

public class GenericTest3 {
	public static void main(String[] args) {
		Goods<String> gs = new Goods<String>(); // gs 객체 생성시 T는 String 타입이 된다.
		gs.setObj("키보드");
		String word = gs.getObj();
		
		Goods<Integer> gs2 = new Goods<Integer>(); // gs2 객체 생성시 T는 Integer 타입이 된다.
		gs2.setObj(3);
		Integer i = gs2.getObj();
		
		Goods<Apple> gs3 = new Goods<Apple>(); // gs3 객체 생성시 T는 Apple 타입이 된다.
		gs3.setObj(new Apple());
		Apple ap = gs3.getObj();
		
		Goods<Pencil> gs4 = new Goods<Pencil>(); // gs4 객체 생성시 T는 Pencil 타입이 된다.
		gs4.setObj(new Pencil());
		Pencil pen = gs4.getObj();
		
		// 제네릭 인터페이스의 타입을 String 으로 지정.
		Basket<String> b = new Basket<String>() { // 익명 이너 클래스를 이용한 인터페이스 객체 생성.
			@Override
			public void putIn(String something) {
				System.out.println(something + "을(를) 담았습니다.");
			}
		};
		b.putIn("신발");
		
		// 제네릭 인터페이스의 타입을 Apple 으로 지정하기.
		Basket<Apple> appleBasket = new Basket<Apple>() {
			@Override
			public void putIn(Apple something) {
				System.out.println(something + "을(를) 담았습니다.");
			}
		};
		appleBasket.putIn(new Apple());
	}
}
