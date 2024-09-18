package week03;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0); // 실행예외 (ArithmeticException)
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
