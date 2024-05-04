package week09;

class A {
	void averageScore(int... score) {
		int sum = 0;
		for (int k : score) {
			sum += k;
		}
		System.out.println((double) sum / score.length);
	}
}

public class Ch07_Q05 {
	public static void main(String[] args) {
		A a = new A();

		a.averageScore(1);
		a.averageScore(1, 2);
		a.averageScore(1, 2, 3);
		a.averageScore(1, 2, 3, 4);
	}
}
