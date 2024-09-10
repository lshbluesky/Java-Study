package week03;

class Student {
	int stdNum;
	String name;
}

public class PrimaryTypes {
	public static void main(String[] args) {
		char C = 'A';
		char C2 = '가';
		char C3 = '4';
		char C4 = 65;
		char C5 = '\uac00';
		char C6 = 52;

		System.out.println(C);
		System.out.println(C2);
		System.out.println(C3);
		System.out.println(C4);
		System.out.println(C5);
		System.out.println(C6);
		System.out.printf("%c => %d\n", C, (int) C);
		System.out.printf("%c => %d\n", C2, (int) C2);
		System.out.printf("%c => %d\n", C3, (int) C3);

		Student std = new Student();
		std.stdNum = 20101234;
		std.name = "Hong Gil Dong";

		System.out.println(std.stdNum);
		System.out.println(std.name);
	}
}
