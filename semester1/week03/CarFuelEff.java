package week03;

import java.util.Scanner;

public class CarFuelEff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dist, fuel;

		System.out.print("자동차 주행거리(km) : ");
		dist = in.nextInt();
		System.out.print("연료 사용량(L) : ");
		fuel = in.nextInt();
		System.out.println("--------------------");
		System.out.println("연비 : " + (double) dist / (double) 40);
	}
}