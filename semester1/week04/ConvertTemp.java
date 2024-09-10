package week04;

import java.util.Scanner;

public class ConvertTemp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("화씨 온도 입력 : ");
		int temp = in.nextInt();
		double res = 5.0 / 9.0 * ((double) temp - 32);
		System.out.println("섭씨 온도 : " + res);

		System.out.print("섭씨 온도 입력 : ");
		temp = in.nextInt();
		res = 9.0 / 5.0 * temp + 32;
		System.out.print("화씨 온도 : " + res);
	}
}
