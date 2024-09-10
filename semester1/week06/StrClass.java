package week06;
// String 클래스는 값의 변경이 불가능.
// String 참조 변수는 동일한 리터럴에 대해 같은 값을 참조.
public class StrClass {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str1;
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
