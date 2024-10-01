package week05;

public class ThreadAttr {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("현재 스레드 이름 : " + curThread.getName());
		System.out.println("스레드 갯수 : " + Thread.activeCount());
		
		for(int i = 0; i<3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i = 0; i<3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		Thread curThread2 = Thread.currentThread();		
		System.out.println("현재 스레드 이름 : " + curThread.getName());
		System.out.println("스레드 갯수 : " + Thread.activeCount());
	}
}
