package week08;

class Book {
	String title;
	int price;

	void buy() {
		System.out.println(title + " 도서 구입 완료.");
	}

	void printInfo() {
		System.out.println("도서 이름 : " + title);
		String p = String.format("%,d", price);
		System.out.println("도서 가격 : " + p + "원");
	}
}

public class BookMain {
	public static void main(String[] args) {
		Book b = new Book(); // 기본 생성자 (컴파일러가 자동으로 생성)
		b.title = "The Little Prince";
		b.price = 15000;
		b.printInfo();
		b.buy();
		
		System.out.println();
		
		Book b2 = new Book();
		b2.title = "Java Programming";
		b2.price = 27000;
		b2.printInfo();
		b2.buy();
	}
}
