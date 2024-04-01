package week03.control1;

public class IfStatement {
	public static void main(String[] args) {
		int broAge = 30;
		int myAge = 33;
		
		if(broAge > myAge) {
			System.out.println("형/오빠입니다.");
			System.out.println("자신보다 " + (broAge-myAge) + "만큼 나이가 많습니다.");
		}
		else {
			System.out.println("동생입니다.");
			System.out.println("나와 " + Math.abs(broAge-myAge) + "살만큼 차이납니다.");
		}
	}
}
