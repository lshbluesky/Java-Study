package week04;

import java.util.Scanner;

public class ShoppingCost {
	public static void main(String[] args) {
		int price, sum = 0, cnt = 0;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("구매한 상품의 가격 입력 : ");
			price = in.nextInt();
			sum += price;
			cnt++;
		} while (sum < 100000);
		
		System.out.println("※ 총 구매 가격 : " + sum);
		System.out.println("※ 구매한 가격 평균 : " + (double)sum / cnt);
	}
}
