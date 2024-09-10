package week04;

import java.util.Scanner;

public class LoopngTest1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("반복 횟수 : ");
		int count = in.nextInt();
		
		int num;
		if (count==9)
			num = 9;
		else if (count==8)
			num = 8;
		else
			num = 0;
		
		System.out.println(num);
		
		int i = 0;
		while(i < count) {
			System.out.println("*****");
			i++;
		}
		
		for (int j = 0; j<count ; j++) {
			System.out.println("★★★★★");
		}
		
		int k=0;
		do {
			System.out.println("☆☆☆☆☆");
			k++;
		} while(k<count);
	}
}
