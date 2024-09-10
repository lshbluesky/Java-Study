package week03;

import java.util.Scanner;

public class CalCircle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원의 반지름? : ");
		int r = in.nextInt();
		System.out.println("---------------");
		
		System.out.printf("면적 : %.0f\n", 3.14*r*r);
		System.out.printf("둘레 : %.1f", 3.14*2*r);
	}
}