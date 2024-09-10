package week05;

public class ArraysTwo1 {
	public static void main(String[] args) {
		int[][] score = { { 30, 50, 70 }, { 60, 90, 80 } };

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}