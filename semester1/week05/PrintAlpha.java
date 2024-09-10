package week05;

public class PrintAlpha {
	public static void main(String[] args) {
		char[] a = new char[26];

		// 알파벳 대문자 출력
		for (int i = 0; i < 26; i++) {
			a[i] = (char) (65 + i);
		}

		for (char k : a) {
			System.out.print(k + " ");
		}
		
		System.out.println(); // 줄 바꿈

		// 알파벳 소문자 출력
		for (int i = 0; i < 26; i++) {
			a[i] = (char) (97 + i);
		}

		for (char k : a) {
			System.out.print(k + " ");
		}
	}
}