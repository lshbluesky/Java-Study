package week05;

import java.util.Random;

public class LottoNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		final int LOTTO_NUM = 6;
		final int MAX_NUM = 6;

		int[] a = new int[LOTTO_NUM];

		for (int i = 0; i < LOTTO_NUM; i++) {
			boolean isDuplicate = false;
			int randNum;

			do {
				isDuplicate = false;
				randNum = rand.nextInt(MAX_NUM) + 1;

				for (int j = 0; j < i; j++) { // 중복 검사
					if (a[j] == randNum) {
						isDuplicate = true;
						break;
					}
				}
			} while (isDuplicate);

			a[i] = randNum;
		}

		for (int i = 0; i < LOTTO_NUM; i++) {
			System.out.println(a[i]);
		}
	}
}