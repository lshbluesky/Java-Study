package week05;

// CaptionRunnable : 자막을 송출하는 기능이 있는 run() 메소드 재정의.
class CaptionRunnable implements Runnable {
	@Override
	public void run() {
		String[] script = { "하나", "둘", "셋", "넷", "다섯" };

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
		}

		for (String str : script) {
			System.out.println("[자막 번호] - " + str);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

// main 스레드 : 비디오 프레임(장면)을 송출하는 기능
public class UseRunnable1 {
	public static void main(String[] args) {
		Runnable r = new CaptionRunnable();
		Thread thread = new Thread(r);
		thread.start();
		
		int[] scene = { 1, 2, 3, 4, 5 };
		for (int num : scene) {
			System.out.print("[비디오 프레임] - " + num + "...");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
