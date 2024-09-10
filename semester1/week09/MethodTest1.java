package week09;

import java.util.Arrays;

public class MethodTest1 {
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}

	public static void print(double a) {
		System.out.println(a);
	}

	public static void print(int a, int b) {
		System.out.println(a + ", " + b);
	}

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(String[] arrStr) {
		System.out.println(Arrays.toString(arrStr));
		
		/*
		for (String s : arrStr)
			System.out.print(s + " ");
		*/
	}
	
	public static void method1(int... values) {
		System.out.println("Method 인수 개수 : " + values.length);
		System.out.println(Arrays.toString(values));
	}
	
	public static void method1(String s, double d, int... values) {
		System.out.println("Method 인수 개수 : " + values.length);
		System.out.println(Arrays.toString(values));
	}

	public static void main(String[] args) {
		print();
		print(3.7);
		print(10, 20);
		print("메소드 오버로딩 테스트.");
		
		String[] arrStr = new String[] { "Kim", "Lee", "Park" };
		print(arrStr);
		
		method1(10);
		method1(10, 20, 30);
		method1(100, 200, 300);
		method1("Kim", 5.8, 11, 22, 33);
	}
}
