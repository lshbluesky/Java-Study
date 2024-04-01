package week05;

import java.util.Random;

public class LottoNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		final int LOTTO_NUM = 6;
		final int MAX_NUM = 10;

		int[] a = new int[LOTTO_NUM];

		for (int i = 0; i < LOTTO_NUM; i++) {
			if (i == 0)
				a[i] = rand.nextInt(MAX_NUM) + 1;
			else {
				a[i] = rand.nextInt(MAX_NUM) + 1;
				if (a[i] == a[i - 1])
					a[i] = rand.nextInt(MAX_NUM) + 1;
			}
		}

		for (int i = 0; i < LOTTO_NUM; i++) {
			System.out.println(a[i]);
		}
	}
}