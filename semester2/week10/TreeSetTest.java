package week10;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("Tree");
		tSet.add("Flower");
		tSet.add("Weed");
		System.out.println(tSet);
		
		TreeSet<Integer> iSet = new TreeSet<>();
		iSet.add(70);
		iSet.add(30);
		iSet.add(50);
		System.out.println(iSet);
	}
}
