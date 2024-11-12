package week11.hashset.book;

public class BookMain {
	public static void main(String[] args) {
		BookManager bManager = new BookManager();

		// 도서 추가
		bManager.addBook(new Book("자바 프로그래밍", "존 듀이", 15000));
		bManager.addBook(new Book("파이썬 에센셜", "제인 스미스", 21000));
		bManager.addBook(new Book("인공지능", "앨리스 브라운", 18000));
		System.out.println("-".repeat(50));

		// 모든 도서 출력
		bManager.displayAllBooks();
		System.out.println("-".repeat(50));

		// 도서 검색
		bManager.searchBook("파이썬 에센셜");
		System.out.println("-".repeat(50));

		// 도서 수정
		bManager.updateBook("인공지능", "앨리스 브라운", 19000);
		System.out.println("-".repeat(50));

		// 도서 삭제
		bManager.removeBook("자바 프로그래밍");
		System.out.println("-".repeat(50));

		// 최종 도서 목록 출력
		bManager.displayAllBooks();
	}
}
