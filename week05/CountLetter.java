package week05;

import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String str = in.nextLine();
		int a = 0, e = 0, i = 0, o = 0, u = 0, ext = 0;

		for (int j = 0; j < str.length(); j++) {
			switch (str.charAt(j)) {
			case 'A':
			case 'a':
				a++;
				break;
			case 'E':
			case 'e':
				e++;
				break;
			case 'I':
			case 'i':
				i++;
				break;
			case 'O':
			case 'o':
				o++;
				break;
			case 'U':
			case 'u':
				u++;
				break;
			default:
				ext++;
				break;
			}
		}

		System.out.println("모음 a의 개수 : " + a);
		System.out.println("모음 e의 개수 : " + e);
		System.out.println("모음 i의 개수 : " + i);
		System.out.println("모음 o의 개수 : " + o);
		System.out.println("모음 u의 개수 : " + u);
		System.out.println("자음 외 기타 문자 : " + ext);
	}
}