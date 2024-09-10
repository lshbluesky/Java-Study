package week06;

import java.util.Scanner;
// 키보드로 영단어를 입력받아서 문자에 해당하는 숫자들의 합을 계산하기.
public class CalWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("영어 단어 입력 : ");
		String str = in.nextLine();
		str = str.toUpperCase();

		int tmp = 0, sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (int) str.charAt(i)-64;
		}
		
		System.out.println("합은 " + sum);
	}
}
