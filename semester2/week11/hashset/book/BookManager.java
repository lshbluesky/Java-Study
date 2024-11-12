package week11.hashset.book;

// 도서 추가, 삭제, 수정, 검색, 전체 보기 기능 구현
// 1. Set 컬렉션 준비
// 2. 준비된 컬렉션에 책을 추가/삭제/수정/검색
import java.util.HashSet;
import java.util.Iterator;

public class BookManager {
	private HashSet<Book> bookSet = new HashSet<Book>();

	public void addBook(Book book) {
		if (!bookSet.contains(book)) {
			bookSet.add(book);
			System.out.println("※ 도서 [" + book.getTitle() + "] 추가 완료.");
		} else
			System.out.println("※ " + book.getTitle() + " 도서가 이미 존재합니다.");
	}

	public void updateBook(String title, String author, int price) {
		for (Book b : bookSet) {
			if (b.getTitle().equals(title)) {
				System.out.println("※ 수정 전 : " + b);
				b.setTitle(title);
				b.setAuthor(author);
				b.setPrice(price);
				System.out.println("※ " + b + " 도서 정보가 수정되었습니다.");
				System.out.println("※ 수정 후 : " + b);
				return;
			}
		}
		System.out.println("※ 도서 이름 : " + title + " 을(를) 찾을 수 없습니다.");
	}

	public void removeBook(String title) {
//		for (Book b : bookSet) {
//			if (b.getTitle().equals(title)) {
//				bookSet.remove(b);
//				System.out.println("※ 도서 : " + title + " 이(가) 삭제되었습니다.");
//				return;
//			}
//		}
//		System.out.println("※ 도서 이름 : " + title + " 을(를) 찾을 수 없습니다.");
		Iterator<Book> iter = bookSet.iterator();
		while (iter.hasNext()) {
			Book b = iter.next();
			if (b.getTitle().equals(title)) {
				iter.remove();
				System.out.println("※ 도서 : " + title + " 이(가) 삭제되었습니다.");
				return; // removeBook 메소드 탈출
			}
		}
		System.out.println("※ 도서 이름 : " + title + " 을(를) 찾을 수 없습니다.");
	}

	public void searchBook(String title) {
		for (Book b : bookSet) {
			if (b.getTitle().equals(title)) {
				System.out.println("※ Found : " + b);
				return;
			}
		}
		System.out.println("※ 도서 이름 : " + title + " 을(를) 찾을 수 없습니다.");
	}

	public void displayAllBooks() {
		if (bookSet.isEmpty()) {
			System.out.println("도서 정보가 없습니다.");
		} else {
			System.out.println("※ 전체 도서 정보");
			System.out.println("※ 현재 등록되어 있는 도서 개수 : " + bookSet.size());
//			for (Book b : bookSet) {
//				System.out.println(b);
//			}
			Iterator<Book> iter = bookSet.iterator();
			while (iter.hasNext())
				System.out.println(iter.next());
		}
	}
}
