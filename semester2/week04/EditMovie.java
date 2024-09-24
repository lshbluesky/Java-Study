package week04;

public class EditMovie {
	public static void main(String[] args) {
		// 비디오 프레임(장면)을 송출하는 코드
		int[] scene = { 1, 2, 3, 4, 5 };
		for (int num : scene) {
			System.out.println("[비디오 프레임] - " + num);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

		// 자막을 송출하는 코드
		String[] script = { "하나", "둘", "셋", "넷", "다섯" };
		for (String str : script) {
			System.out.println("[자막 번호] - " + str);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
