package week04;

import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		int a, b, c, max;
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("세 개의 정수 입력 : ");
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			if (a == b && a == c & b == c)
				break;

			if (a > b) {
				if (a > c)
					max = a;
				else
					max = c;
			} else {
				if (b > c)
					max = b;
				else
					max = c;
			}

			System.out.println("최댓값은 " + max + "이다.");
		}
	}
}
