package week05;

// CaptionRunnable : 자막을 송출하는 기능이 있는 run() 메소드 재정의.
class CaptionRunnable2 implements Runnable {
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

// VideoRunnable : 비디오 프레임(장면)을 송출하는 기능이 있는 run() 메소드 재정의.
class VideoRunnable extends Thread {
	@Override
	public void run() {
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

public class UseRunnable2 {
	public static void main(String[] args) {
		Runnable captionRunnable2 = new CaptionRunnable2();
		Runnable videoRunnable = new VideoRunnable();
		
		Thread captionThread = new Thread(captionRunnable2);
		Thread videoThread = new Thread(videoRunnable);
		
		captionThread.start();
		videoThread.start();		
	}
}
