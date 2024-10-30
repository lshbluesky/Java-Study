package exam;

public class ArithmeticExceptionTest {
	public static void main(String[] args) {
		try {
			int result = divideNumbers(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public static int divideNumbers(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
