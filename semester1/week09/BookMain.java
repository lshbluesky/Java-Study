package week09;

class Book {
	String title;
	String writer;
	String publisher;
	
	Book() {
		title = "Do it! 자바 완전 정복";
		writer = "김동형";
		publisher = "이지스퍼블리싱";
	}
	
	void search(String title) {
		if(this.title.equals(title))
			System.out.println(title + " 책을 찾았습니다.");
	}
	
	void showBook() {
		System.out.println("도서 이름 : " + title);
		System.out.println("도서 작가 : " + writer);
		System.out.println("도서 출판사 : " + publisher);
	}
}

public class BookMain {
	public static void main(String[] args) {
		Book b = new Book();
		b.search("Do it! 자바 완전 정복");
		b.showBook();
	}
}
