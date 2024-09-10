package week02;

interface ifA {
	void print();
}
/*
class ifClass implements ifA {
	public void print() {
		System.out.println("ifClass");
	}
}
*/
public class AnonymousInner {
	public static void main(String[] args) {
		// ifA ifa = new ifClass();

		ifA ifa = new ifA() {
			@Override
			public void print() {
				System.out.println("익명 이너 클래스");
			}
		};

		ifa.print();
	}
}
