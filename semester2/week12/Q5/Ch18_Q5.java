package week12.Q5;

import java.util.Arrays;

interface A {
	double[] abc(int len);
}

public class Ch18_Q5 {
	public static void main(String[] args) {
		A a = double[]::new;
		double[] arr = a.abc(3);
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
