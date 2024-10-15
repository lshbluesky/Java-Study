package week07;

// class Apple {}
// class Pencil {}

// 모든 상품을 담을 수 있는 클래스
class Goods {
	Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class GenericTest2 {
	public static void main(String[] args) {
		Goods gs1 = new Goods();
		gs1.setObj(new Apple());
		Object obj = gs1.getObj();
		Apple ap = (Apple) gs1.getObj();

		gs1.setObj(new Pencil());
		Pencil pen = (Pencil) gs1.getObj();
	}
}
