package week03;

import java.util.Scanner;

class Student2 {
	String name, sid;
}

public class KeyIn2 {
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		Student2 std = new Student2();
		
		System.out.print("이름을 입력하시오. : ");
		std.name = keyIn.next();
		std.sid = keyIn.next();
		/*
		std.name = keyIn.nextLine();
		System.out.print("학번을 입력하시오. : ");
		std.sid = keyIn.nextInt();
		*/
		System.out.println("※ 이름 : " + std.name + "\n※ 학번 : " + std.sid);
	}
}
