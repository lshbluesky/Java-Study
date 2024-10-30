package exam;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class MyThread extends Thread {
	Counter count;

	public MyThread(Counter count) {
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			count.increment();
		}
	}
}

public class CounterTest {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt = new Counter();
		Thread th1 = new MyThread(cnt);
		th1.start();
		Thread th2 = new MyThread(cnt);
		th2.start();

		th1.join();
		th2.join();
		System.out.println(cnt.getCount());
	}
}
