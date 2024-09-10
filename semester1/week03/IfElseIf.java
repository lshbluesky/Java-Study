package week03;

public class IfElseIf {
	public static void main(String[] args) {
		int score = 100;
		char grade;

		if (score > 100 || score < 0) {
			System.out.println("올바르지 않은 점수입니다.");
		} else {
			switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			System.out.println("학점은 " + grade + "입니다.");
		}
	}
}