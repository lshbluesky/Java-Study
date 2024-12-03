package week14.stream;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentManager sm = new StudentManager();

		while (true) {
			System.out.println("\n==== 학생 성적 관리 프로그램 ====");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 검색");
			System.out.println("3. 전체 출력 (평균/합계 기준 내림차순)");
			System.out.println("4. 학생 성적 수정");
			System.out.println("5. 종료");
			System.out.print("메뉴를 선택하세요: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // 버퍼 비우기

//			switch (choice) {
//			case 1:
//				sm.addStudent();
//				break;
//			case 2:
//				sm.searchStudent();
//				break;
//			case 3:
//				sm.printAllStudents();
//				break;
//			case 4:
//				sm.updateStudent();
//				break;
//			case 5:
//				System.out.println("프로그램을 종료합니다.");
//				return;
//			default:
//				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//			}

			switch (choice) {
			case 1 -> sm.addStudent();
			case 2 -> sm.searchStudent();
			case 3 -> sm.printAllStudents();
			case 4 -> sm.updateStudent();
			case 5 -> {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
		}
	}
}
