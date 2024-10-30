package exam;

class Thread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("*".repeat(30));
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Runnable r = new Thread2();
		Thread th = new Thread(r);
		th.start();
	}
}
