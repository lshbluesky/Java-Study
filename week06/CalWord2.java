package week06;

import java.util.Scanner;
// 키보드로 영단어를 입력받아서 문자에 해당하는 숫자들의 합을 계산하기.
/* 순서
 * 1. 정수형 배열 n 선언하고 1~26까지의 숫자 저장.
 * 2. 키보드로 영단어를 입력받고 대문자로 변환.
 * 3. String.charAt(i) 문자열의 인덱스로 1개 문자 추출하고 정수로 형변환하고 65를 빼기.
 * 4. 그 값을 n 배열의 위치로 하여 숫자 읽기.
 * 5. 그 숫자들을 누적하여 더하고 출력하기.
 * */
public class CalWord2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] n = new int[26];
		//char[] alpha = new char[26];

		for (int i = 0; i < 26; i++) {
			n[i] = i + 1;
			//alpha[i] = (char) (i + 65);
		}

		System.out.print("영어 단어 입력 : ");
		String str = in.nextLine();
		str = str.toUpperCase();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += n[(int) (str.charAt(i)) - 65];
		}
		System.out.println("합은 " + sum);
	}
}
