package week03;

public class PrintJava {
	public static void main(String[] args) {
		System.out.println("Hong Gil Dong");
		System.out.println("  ♣♣  ♣♣");
		System.out.println("♣♣♣♣♣♣♣♣♣♣");
		System.out.println(" ♣♣♣♣♣♣♣♣");
		System.out.println("  ♣♣♣♣♣♣");
		System.out.println("   ♣♣♣♣");
		System.out.println("    ♣♣");
		
		int[] a = new int[10];
		for (int i=0; i<10; i++) {
			a[i]=i;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(a[i]);
		}
	}
}
