package week05;

public class UseRunnable3 {
	public static void main(String[] args) {
		// 비디오 프레임(장면)을 송출하는 스레드 객체 생성, 익명 이너 클래스 사용.
		Thread videoThread = new Thread(new Runnable() {
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
		});
		
		// 자막을 송출하는 스레드 객체 생성, 익명 이너 클래스 사용.
		Thread captionThread = new Thread(new Runnable() {
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
		});
		
		videoThread.start();
		captionThread.start();
	}
}
