package week03;

import java.util.Scanner;

public class KeyIn {
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		String name, sid;
		
		System.out.print("이름을 입력하시오. : ");
		name = keyIn.nextLine();
		System.out.print("학번을 입력하시오. : ");
		sid = keyIn.nextLine();
		
		System.out.println("※ 이름 : " + name + "\n※ 학번 : " + sid);
	}
}
