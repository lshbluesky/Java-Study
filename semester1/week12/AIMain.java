package week12;

class AI {
	private int sid;
	private String name, phone;

	AI(int sid, String name, String phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	void showInfo() { // 필드 정보를 출력하는 메소드
		System.out.println("▦ 학번 : " + this.sid);
		System.out.println("▦ 이름 : " + this.name);
		System.out.println("▦ 전화번호 : " + this.phone);
		System.out.println();
	}
	
	static void showInfo2(AI[] ai) { // 필드 정보를 출력하는 메소드 2
		System.out.println("------------------------------");
		for (int i = 0; i < ai.length; i++) {
			ai[i].showInfo();
		}
		System.out.println("------------------------------");
	}

	void setPhone(String ph) { // 전화번호를 수정하는 메소드
		this.phone = ph;
		System.out.println("▦ [" + this.name + "] 전화번호가 변경되었습니다.");
		System.out.println();
	}

	void getSid() { // 학번만 반환하는 메소드
		System.out.println("▦ [" + this.name + "] 학번 : " + this.sid);
	}
	
	static void getSid2(AI[] ai) { // 학번만 반환하는 메소드 2
		for (int i = 0; i < ai.length; i++) {
			ai[i].getSid();
		}
		System.out.println();
	}
}

public class AIMain {
	public static void main(String[] args) {
		AI[] ai = new AI[] { // 길이가 3인 객체 배열 생성
			new AI(21101111, "Kim", "010-1111-2222"),
			new AI(22103333, "Lee", "010-3333-5555"),
			new AI(23107777, "Park", "010-7777-8888")
		};
		
		AI.showInfo2(ai); // 필드 정보 출력
		
		AI.getSid2(ai); // 학번만 출력
		
		ai[0].setPhone("010-1234-5678"); // Kim 전화번호 변경
		
		AI.showInfo2(ai); // 전화번호 변경 후 다시 필드 정보 출력
	}
}
