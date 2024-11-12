package week11.treeset.dictionary;

import java.util.Scanner;

public class DicMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DictionaryManager2 manager = new DictionaryManager2();

		while (true) {
			System.out.println("\n※ 영한사전 관리 프로그램");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 수정");
			System.out.println("3. 단어 삭제");
			System.out.println("4. 단어 검색");
			System.out.println("5. 전체 단어 보기");
			System.out.println("0. 종료");
			System.out.print("선택: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // 버퍼 비우기
			switch (choice) {
			case 1:
				System.out.print("영어 단어 입력: ");
				String english = scanner.nextLine();
				System.out.print("뜻 입력: ");
				String korean = scanner.nextLine();
				manager.addWord(english, korean);
				break;
			case 2:
				System.out.print("수정할 영어 단어 입력: ");
				english = scanner.nextLine();
				System.out.print("새로운 뜻 입력: ");
				korean = scanner.nextLine();
				manager.updateWord(english, korean);
				break;
			case 3:
				System.out.print("삭제할 영어 단어 입력: ");
				english = scanner.nextLine();
				manager.removeWord(english);
				break;
			case 4:
				System.out.print("검색할 영어 단어 입력: ");
				english = scanner.nextLine();
				manager.searchWord(english);
				break;
			case 5:
				manager.displayAllWords();
				break;
			case 0:
				System.out.print("※ 단어 사전을 종료합니다...");
				scanner.close();
				return;
			default:
				System.out.print("※ [Error] : 올바르지 않은 메뉴 번호입니다.");
			}
		}
	}
}
