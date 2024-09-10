package week04;

import java.util.Scanner;

class Hypoten {
	int w=0,h=0;
	
	double calc() {
		return Math.sqrt(w * w + h * h);		
	}
}

public class CalHypoten2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Hypoten hypo = new Hypoten();
				
		System.out.print("밑변 길이 입력 : ");
		hypo.w = in.nextInt();
		System.out.print("높이 길이 입력 : ");
		hypo.h = in.nextInt();

		System.out.println("빗변의 길이 : " + hypo.calc());
	}
}
