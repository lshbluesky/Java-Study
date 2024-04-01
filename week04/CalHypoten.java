package week04;

import java.util.Scanner;

public class CalHypoten {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("밑변 길이 입력 : ");
		int w = in.nextInt();
		System.out.print("높이 길이 입력 : ");
		int h = in.nextInt();

		System.out.println("빗변의 길이 : " + Math.sqrt(w * w + h * h));
	}
}
