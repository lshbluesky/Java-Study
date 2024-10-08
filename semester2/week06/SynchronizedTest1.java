package week06;

// 공유 객체 : 스레드 간 공유
class MyData {
	int data = 3;

	public  void plusData() {
		// data += 1;	
		synchronized(new Object()) {
			int num = data; // 값을 읽기
			// try {Thread.sleep(2000);} catch (InterruptedException e) {} // 다른 스레드가 접근할 여지를 주도록 2초 지연.
			data = num + 1; // 값을 1만큼 증가
		}
	}
}

// 공유 객체를 이용할 스레드 생성
class Thread1 extends Thread {
	MyData md;
	
	Thread1(MyData md) {
		this.md = md;
	}
	
	@Override
	public void run() {
		md.plusData();
		System.out.println(getName() + " 실행 결과 : " + md.data);
	}
}

public class SynchronizedTest1 {
	public static void main(String[] args) {
		MyData md = new MyData();
		
		// 1st 스레드
		Thread1 th1 = new Thread1(md);
		th1.setName("FirstThread");
		th1.start();
		
		// try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 2nd 스레드
		Thread1 th2 = new Thread1(md);
		th2.setName("SecondThread");
		th2.start();
	}
}
