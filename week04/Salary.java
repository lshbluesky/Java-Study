package week04;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		int curSal, step;
		double raise = 0, newSal = 0;
		Scanner in = new Scanner(System.in);
				
		System.out.print("현재 연봉 입력 : ");
		curSal = in.nextInt();
		
		System.out.print("근무 평가 등급 입력 : ");
		step = in.nextInt();
		
		switch (step) {
		case 1:
			raise = (double)curSal * 0.06;
			break;
		case 2:
			raise = (double)curSal * 0.04;
			break;
		case 3:
			raise = (double)curSal * 0.02;
			break;
		default:
			System.out.println("올바르지 않은 등급입니다.");
			break;				
		}
		
		newSal = curSal + raise;			
		System.out.println("현재 연봉액 : " + curSal);
		System.out.println("연봉 인상액 : " + raise);
		System.out.println("새로운 연봉 : " + newSal);
	}
}
