package exam;

import java.util.Arrays;

public class NumArray {
	public static void main(String[] args) {
		int numbers[] = new int[] { 1, 3, 2, 7, 4, 10, 8, 6, 5, 9 };
		int max = findMax(numbers);
		System.out.println(max);
	}

	public static int findMax(int[] n) {
		Arrays.sort(n);
		return n[n.length - 1];
	}
}
