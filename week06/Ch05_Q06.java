package week06;

public class Ch05_Q06 {
	public static void main(String[] args) {
		int[][] a = new int[2][];
		a[0] = new int[] { 1, 3, 5 };
		a[1] = new int[] { 7, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		System.out.println();

		for (int[] m : a) {
			for (int n : m) {
				System.out.println(n);
			}
		}
	}
}
