package week13;

class Friend {
	String name, phone;

	Friend(String n, String p) {
		this.name = n;
		this.phone = p;
	}

	void showInfo() {
		System.out.println("▦ 이름 : " + this.name);
		System.out.println("▦ 전화번호 : " + this.phone);
		System.out.println();
	}

	static void showInfo2(Friend[] frns) {
		for (int i = 0; i < frns.length; i++) {
			frns[i].showInfo();
		}
	}
}

class CompFriend extends Friend {
	String department;

	CompFriend(String n, String p, String department) {
		super(n, p);
		this.department = department;
	}

	@Override
	void showInfo() {
		System.out.println("▦ 이름 : " + this.name);
		System.out.println("▦ 전화번호 : " + this.phone);
		System.out.println("▦ 부서 : " + this.department);
		System.out.println();
	}
}

class UnivFriend extends Friend {
	String major;

	UnivFriend(String n, String p, String major) {
		super(n, p);
		this.major = major;
	}

	@Override
	void showInfo() {
		System.out.println("▦ 이름 : " + this.name);
		System.out.println("▦ 전화번호 : " + this.phone);
		System.out.println("▦ 전공 : " + this.major);
		System.out.println();
	}
}

public class FriendMain {
	public static void main(String[] args) {
		Friend[] frns = new Friend[] {
			new CompFriend("Kim", "010-1111-2222", "인사부"),
			new CompFriend("Seo", "010-3333-5555", "전산부"),
			new CompFriend("Park", "010-7777-8888", "영업부"),
			new UnivFriend("Song", "010-1212-3434", "수학과"),
			new UnivFriend("Lee", "010-5656-7878", "컴퓨터공학과"),
			new UnivFriend("Scott", "010-3456-7890", "임상병리학과")
		};

		Friend.showInfo2(frns);
	}
}
