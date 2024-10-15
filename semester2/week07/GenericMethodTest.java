package week07;

class GenericMethod {
	public <T> T method1(T t) {	
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
	
	public <T> T method4(T t) {
		// 나중에 String을 사용하려고 하였어도 메소드 안에서 사용할 변수들의 타입이 정해지지 않았으므로
		// t 변수에 대해 사용할 수 있는 메소드들은 Object 의 메소드만 사용 가능하다.
		// return t.length(); 불가능
		return t;
	}
}

public class GenericMethodTest {
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		String str1 = gm.<String>method1("Hello.");
		int num = gm.<Integer>method1(100);
		System.out.println(str1);
		System.out.println(num);
		
		boolean bool1 = gm.<Double>method2(3.14, 3.15);
		boolean bool2 = gm.<String>method2("Java", "Java");
		System.out.println(bool1 + ", " + bool2);
		
		gm.<String, Integer>method3("수학", 100);
		gm.method3(100, "과학");
		
		
	}
}
