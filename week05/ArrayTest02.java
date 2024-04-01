package week05;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		// String str = "I am a boy.";
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String str = in.nextLine();
		int[] ch = new int[] { 0, 0, 0, 0, 0, 0 };

		for (int j = 0; j < str.length(); j++) {
			switch (str.charAt(j)) {
			case 'A':
			case 'a':
				ch[0]++;
				break;
			case 'E':
			case 'e':
				ch[1]++;
				break;
			case 'I':
			case 'i':
				ch[2]++;
				break;
			case 'O':
			case 'o':
				ch[3]++;
				break;
			case 'U':
			case 'u':
				ch[4]++;
				break;
			default:
				ch[5]++;
				break;
			}
		}

		System.out.println("모음 a의 개수 : " + ch[0]);
		System.out.println("모음 e의 개수 : " + ch[1]);
		System.out.println("모음 i의 개수 : " + ch[2]);
		System.out.println("모음 o의 개수 : " + ch[3]);
		System.out.println("모음 u의 개수 : " + ch[4]);
		System.out.println("자음 외 기타 문자 : " + ch[5]);
	}
}