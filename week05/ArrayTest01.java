package week05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] score = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("점수 입력 (0~100) : ");
			score[i] = in.nextInt();

			if (score[i] > 100 || score[i] < 0)
				i--;
		}
		
		int sum = 0;
		/*
		for (int i = 0; i < 3; i++) {
			System.out.print(score[i] + " ");
			sum += score[i];
		}
		*/
		
		for (int k:score) { // for ~ each 구문
			sum += k;
		}

		System.out.println(Arrays.toString(score));
		System.out.println("합계 : " + sum);
	}
}