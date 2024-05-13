package week11;

class Pen {
	protected int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class SharpPencil extends Pen { // 연필
	private int width;
}

class Ballpen extends Pen { // 볼펜
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends Ballpen { // 만년필
	public void refill(int n) {
		setAmount(n);
	}
}

public class PenMain {
	public static void main(String[] args) {
		// main() 메소드 내용은 생략.
	}
}
