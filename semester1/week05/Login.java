package week05;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short cnt = 0;

		while (cnt < 3) {
			System.out.print("암호를 입력하세요. : ");
			String pwd = in.nextLine();

			if (pwd.equals("cat1004")) {
				System.out.println("환영합니다.");
				break;
			} else {
				System.out.println("암호가 틀립니다.");
				cnt++;
			}
		}
		if (cnt >= 3)
			System.out.println("접속을 거부합니다.");
	}
}