package exam;

public class GenericMethodTest {
	public static void main(String[] args) {
		Integer[] intArray = new Integer[] { 100, 88, 90, 84, 75 };
		String[] strArray = new String[] { "Korea", "Canada", "Austria" };

		printArray(intArray);
		printArray(strArray);
	}

	public static <T> void printArray(T[] a) {
		for (T k : a) {
			System.out.println(k);
		}
	}
}
