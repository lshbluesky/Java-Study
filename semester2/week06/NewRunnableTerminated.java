package week06;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		// Thread 상태
		Thread.State state;

		// #1. 객체생성 (NEW)
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 100000000L; i++) {
				}
			}
		};
		state = thread.getState();
		System.out.println("thread State : " + state); // NEW

		// #2. Thread 시작 (RUNNABLE)
		thread.start();
		state = thread.getState();
		System.out.println("thread State : " + state); // RUNNABLE

		// #3. Thread 종료 (TERMINATED)
		try {
			thread.join(); // 이를 호출한 main 스레드가 대기, CPU 할당은 thread 에게 하라는 의미
		} catch (InterruptedException e) {
		}
		state = thread.getState();
		System.out.println("thread State : " + state); // TERMINATED
	}
}
