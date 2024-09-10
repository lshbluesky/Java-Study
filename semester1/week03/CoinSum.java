package week03;

import java.util.Scanner;

public class CoinSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intM, sumMoney=0;
		
		System.out.print("50000원은 몇 장? :  ");
		intM = in.nextInt();
		sumMoney+=intM*50000;
		System.out.print("10000원은 몇 장? :  ");
		intM = in.nextInt();
		sumMoney+=intM*10000;
		System.out.print("5000원은 몇 장? :  ");
		intM = in.nextInt();
		sumMoney+=intM*5000;
		System.out.print("1000원은 몇 장? :  ");
		intM = in.nextInt();
		sumMoney+=intM*1000;
		System.out.print("500원은 몇 개? :  ");
		intM = in.nextInt();
		sumMoney+=intM*500;
		System.out.print("100원은 몇 개? :  ");
		intM = in.nextInt();
		sumMoney+=intM*100;
		System.out.print("50원은 몇 개? :  ");
		intM = in.nextInt();
		sumMoney+=intM*50;
		System.out.print("10원은 몇 개? :  ");
		intM = in.nextInt();
		sumMoney+=intM*10;
		System.out.println("--------------------");
		
		String str = String.format("%,d", sumMoney);
		System.out.println("총 금액 : " + str + "원");
	}
}