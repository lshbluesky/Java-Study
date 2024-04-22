package week08;

class Cal {
	int a;
	int b;

	static public int sum(int a, int b) {
		return a + b;
	}

	public int multi(int a, int b) {
		return a * b;
	}
}

public class CalMain {
	public static void printBar() {
		System.out.println("----------");
	}

	public static void main(String[] args) {
		Cal c = new Cal();
		// c.a = 10;
		// c.b = 20;
		
		System.out.println(Cal.sum(10, 20));
		System.out.println(c.multi(10, 20));
		
		printBar();
	}
}
