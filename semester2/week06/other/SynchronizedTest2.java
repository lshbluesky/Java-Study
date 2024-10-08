package week06.other;

class MyData {
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() {
		// synchronized (this) {
		synchronized (new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class SynchronizedTest2 {
	public static void main(String[] args) {
		MyData myData = new MyData();

		// Thread 1 : abc() 실행
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();

		// Thread 2 : bcd() 실행
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();

		// Thread 3 : cde() 실행
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();

	}
}
