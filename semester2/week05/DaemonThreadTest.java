package week05;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬 쓰레드" : "일반 쓰레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		// 일반 Thread
		Thread thread1 = new MyThread1();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();

		// 데몬 Thread
		Thread thread2 = new MyThread1();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();

		// 3.5초 후 메인 Thread 종료.
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread 종료");
	}
}
