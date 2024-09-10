package exam;

class Parents {
	void test() {
		System.out.println("Parent");
	}
}

class ChildA extends Parents {
	void test() {
		System.out.println("ChildA");
	}
}

public class Main extends ChildA {
	void test() {
		System.out.println("Main");
	}
	
	public static void main(String[] args) {
		Parents b1 = new Main();
		Parents b2 = new ChildA();
		Parents b3 = new Main();
		
		b1 = b3;
		Parents b4 = b3;
		
		b1.test();
		b4.test();	
	}
}
