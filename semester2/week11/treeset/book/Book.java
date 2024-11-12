package week11.treeset.book;

import java.util.Objects;

public class Book implements Comparable<Book> {
	String title;
	String author;
	int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "[Title : " + title + ", Author : " + author + ", Price : " + price + "]";
	}

	@Override
	public int compareTo(Book b) {
		if (price < b.price) {
			return -1;
		} else if (this.title == b.title) {
			return 0;
		} else
			return 1;
	}
}
