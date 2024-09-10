package week09;

class ModifierClass {
	private int a; // 동일 클래스 내에서만 접근 가능
	protected int b; // 동일 패키지의 클래스에서 접근 가능 + 다른 패키지의 자식 클래스에서 접근 가능
	int c; // default 키워드는 생략, 동일 패키지의 모든 클래스에서 접근 가능
	static public int d; // 동일 패키지의 클래스에서 접근 가능 + 다른 패키지의 모든 클래스에서 접근 가능
	
	private void print() {}
	protected void print2() {}
	void print3() {}
	public void print4() {}
}

public class Modifier {
	public static void main(String[] args) {
		ModifierClass t = new ModifierClass();
		t.b = 10;
		t.c = 20;
		ModifierClass.d = 30;
		
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(ModifierClass.d);
	}
}
