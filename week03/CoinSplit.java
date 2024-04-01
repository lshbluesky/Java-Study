package week03;

import java.util.Scanner;

public class CoinSplit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int m = in.nextInt();
		int coin = 0, rest = 0;

		coin = m / 50000;
		rest = m % 50000;
		System.out.println("50000 -> " + coin);

		coin = rest / 10000;
		rest = rest % 10000;
		System.out.println("10000 -> " + coin);

		coin = rest / 5000;
		rest = rest % 5000;
		System.out.println("5000 -> " + coin);

		coin = rest / 1000;
		rest = rest % 1000;
		System.out.println("1000 -> " + coin);

		coin = rest / 500;
		rest = rest % 500;
		System.out.println("500 -> " + coin);

		coin = rest / 100;
		rest = rest % 100;
		System.out.println("100 -> " + coin);

		coin = rest / 50;
		rest = rest % 50;
		System.out.println("50 -> " + coin);

		coin = rest / 10;
		rest = rest % 10;
		System.out.println("10 -> " + coin);
	}
}