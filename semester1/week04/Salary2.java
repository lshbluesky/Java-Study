package week04;

import java.util.Scanner;

class Sal {
	int curSal, step;
	double raise = 0, newSal = 0;
	
	void calcSal() {
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
	}
}

public class Salary2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sal sal = new Sal();
				
		System.out.print("현재 연봉 입력 : ");
		sal.curSal = in.nextInt();
		System.out.print("근무 평가 등급 입력 : ");
		sal.step = in.nextInt();
		
		sal.calcSal();
		
		System.out.println("현재 연봉액 : " + sal.curSal);
		System.out.println("연봉 인상액 : " + sal.raise);
		System.out.println("새로운 연봉 : " + sal.newSal);
	}
}