package week12;

interface Lambda {
	int sumArr(int[] arr);
}

public class LambdaSumArr {
	public static void main(String[] args) {
		Lambda lambda = (arr) -> {
			int sum = 0;
			for (int i : arr)
				sum += i;
			return sum;
		};

		System.out.println(lambda.sumArr(new int[] { 1, 2, 3, 4, 5 }));
	}
}
