package week04;

class MinusException extends Exception {
	MinusException() {
		super();
	}

	MinusException(String s) {
		super(s);
	}
}

class OverException extends Exception {
	OverException() {
		super();
	}

	OverException(String s) {
		super(s);
	}
}

class Checking {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생 : 음수값이 입력되었습니다.");
		} else if (score > 100) {
			throw new OverException("예외 발생 : 100점을 초과하였습니다.");
		} else {
			System.out.println("정상적인 값입니다.");
		}
	}
}

public class UserExceptionTest {
	public static void main(String[] args) {
		Checking ch = new Checking();
		try {
			ch.checkScore(95);
			ch.checkScore(125);
		} catch (MinusException | OverException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
