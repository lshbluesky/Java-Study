package week05;

// CaptionThread : 자막을 송출하는 기능이 있는 run() 메소드 재정의.
class CaptionThread2 extends Thread {
	@Override
	public void run() {
		String[] script = { "하나", "둘", "셋", "넷", "다섯" };

		try {
			Thread.sleep(20);
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

// VideoThread : 비디오 프레임(장면)을 송출하는 기능이 있는 run() 메소드 재정의.
class VideoThread extends Thread {
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

// main 스레드
public class UseThread2 {
	public static void main(String[] args) {
		CaptionThread2 caption = new CaptionThread2();
		caption.start();
		
		VideoThread video = new VideoThread();
		video.start();
	}
}
