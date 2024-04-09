package week06;

public class MainMethod {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(b+1);
		System.out.println(c+1);
		
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d+1);
		System.out.println(e+1);
	}
}
