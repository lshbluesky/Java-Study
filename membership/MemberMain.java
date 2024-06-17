package membership;

import java.util.Scanner;

class Member { // Member 클래스 정의.
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	public static final String FONT_BLUE = "\u001B[34m";
	public static final String FONT_CYAN = "\u001B[36m";

	String name; // 고객의 이름
	String phoneNum; // 고객의 전화번호
	boolean isVip; // 고객의 멤버십 등급 (isVip = false 일 경우 Basic 등급, isVip = true 일 경우 VIP 등급)
	int bonus; // 고객의 보너스 포인트

	Member() { // Member 클래스의 기본 생성자, 매개 변수가 없으면 고객 이름과 전화 번호를 null, 멤버십 등급은 Basic, 보너스 포인트는 0으로 초기화.
		this.name = null;
		this.phoneNum = null;
		this.isVip = false;
		this.bonus = 0;
	}

	Member(String name, String phoneNum) { // Member 클래스의 생성자, 고객 이름과 전화번호를 매개 변수로 입력받음.
		this();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	Member(String name, String phoneNum, boolean isVip) { // Member 클래스의 생성자, 고객 이름과 전화번호, VIP 등급의 여부를 매개 변수로 입력받음.
		this(name, phoneNum);
		this.isVip = isVip;
		if (isVip) // 만약, VIP 고객일 경우 기본적으로 5000 보너스 포인트를 지급함.
			this.bonus = 5000;
	}

	void showMemberInfo() { // 고객의 정보(이름, 멤버십 등급, 보너스 포인트, 전화번호)를 출력하는 메소드.
		System.out.println("※ 고객 이름 : " + name);
		System.out.println("※ 고객 전화번호 : " + phoneNum);
		System.out.println("※ 멤버십 등급 : " + (isVip ? "★ VIP ★" : "♣ Basic ♣"));
		System.out.println("※ 보너스 포인트 : " + bonus);
		System.out.println("");
	}

	void editPhoneNum() { // 고객의 전화번호를 변경하는 메소드.
		Scanner in = new Scanner(System.in);
		System.out.print("▦ 변경할 고객 전화번호 입력 : ");
		this.phoneNum = in.nextLine();
		System.out.println(FONT_GREEN + "※ 알림 : [" + this.name + "] 고객님의 전화번호가 변경되었습니다." + RESET);
	}

	void editGrade() { // 고객의 멤버십 등급을 변경하는 메소드.
		Scanner in = new Scanner(System.in);		
		System.out.println(FONT_GREEN + "▦ 변경할 고객 멤버십 등급 선택 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 1. Basic | 2. VIP ▦" + RESET);
		System.out.print("▦ 등급을 선택해주세요. : ");
		switch (in.nextInt()) {
		case 1: // Basic 등급으로 변경하려는 경우
			this.isVip = false;
			this.bonus = 0; // Basic 등급으로 변경된 경우 보너스 포인트를 모두 소멸시킴.
			break;
		case 2: // VIP 등급으로 변경하려는 경우
			this.isVip = true;
			this.bonus = 5000; // VIP 등급으로 변경된 경우 5000 보너스 포인트를 지급함.
			break;
		default: // 올바르지 않은 등급 번호를 입력한 경우
			System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 등급 번호입니다." + RESET);
			break;
		}
		System.out.println(FONT_GREEN + "※ 알림 : [" + this.name + "] 고객님의 멤버십 등급이 변경되었습니다." + RESET);
	}

	void editBonus() { // 고객의 보너스 포인트를 변경하는 메소드.
		Scanner in = new Scanner(System.in);
		System.out.print("▦ 변경할 보너스 포인트 입력 : ");
		this.bonus = in.nextInt();
		System.out.println(FONT_GREEN + "※ 알림 : [" + this.name + "] 고객님의 보너스 포인트가 변경되었습니다." + RESET);
	}
	
	static int selectMember() { // 정보(멤버십 등급, 보너스 포인트, 전화번호)를 변경할 고객을 선택하여 해당 번호를 반환하는 메소드.
		Scanner in = new Scanner(System.in);
		int select; // 정보를 변경할 고객의 번호를 입력받아서 저장할 select 변수 정의.
		System.out.println(FONT_GREEN + "▦ 변경할 고객의 번호 선택 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 1. Kim | 2. Lee | 3. Scott ▦" + RESET);
		System.out.print("▦ 변경할 고객을 선택해주세요. : ");
		select = in.nextInt();
		System.out.println("-------------------------------------------------------------------");
		return select;
	}

	static int showMemberMenu() { // 고객 멤버십 관리 메뉴 정보를 출력하고, 메뉴를 선택하여 해당 메뉴 번호를 반환하는 메소드.
		Scanner in = new Scanner(System.in);
		int menu; // 메뉴 번호를 입력받아서 저장할 menu 변수 정의.
		System.out.println("-------------------------------------------------------------------");
		System.out.println(FONT_GREEN + "▦ 고객 멤버십 관리 메뉴 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 1. 고객 멤버십 정보 확인 | 2. 고객 멤버십 등급 변경 | 3. 고객 멤버십 보너스 포인트 변경 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 4. 고객 전화번호 변경 | 9. 고객 멤버십 관리 프로그램 종료 ▦" + RESET);
		System.out.print("▦ 메뉴를 선택해주세요. : ");
		menu = in.nextInt();
		System.out.println("-------------------------------------------------------------------");
		return menu;
	}
}

public class MemberMain {
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	
	public static void main(String[] args) { // main() 메소드.
		Member kim = new Member("Kim", "010-1111-2222", false); // Basic 등급인 Kim 고객의 객체 생성.
		Member lee = new Member("Lee", "010-3333-5555", false); // Basic 등급인 Lee 고객의 객체 생성.
		Member scott = new Member("Scott", "010-7777-8888", true); // VIP 등급인 Scott 고객의 객체 생성.

		while (true) {
			switch (Member.showMemberMenu()) { // 고객 멤버십 관리 메뉴 정보를 표시하는 메소드를 호출하고, 선택된 메뉴 번호를 반환받아서 그에 맞는 기능을 실행.
			case 1: // 고객 멤버십 정보 확인 메뉴를 선택한 경우, 고객 3명 정보를 출력
				kim.showMemberInfo();
				lee.showMemberInfo();
				scott.showMemberInfo();
				break;
			case 2: // 고객 멤버십 등급 변경 메뉴를 선택한 경우
				switch (Member.selectMember()) { // 변경할 고객을 선택하고, 멤버십 등급을 변경함.
				case 1:
					kim.editGrade();
					break;
				case 2:
					lee.editGrade();
					break;
				case 3:
					scott.editGrade();
					break;
				default: // 올바르지 않은 고객을 선택한 경우 다시 선택받음.
					System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 고객 번호입니다. 다시 선택해주세요." + RESET);
					break;
				}
				break;
			case 3: // 고객 멤버십 보너스 포인트 변경 메뉴를 선택한 경우
				switch (Member.selectMember()) { // 변경할 고객을 선택하고, 멤버십 보너스 포인트를 변경함.
				case 1:
					kim.editBonus();
					break;
				case 2:
					lee.editBonus();
					break;
				case 3:
					scott.editBonus();
					break;
				default: // 올바르지 않은 고객을 선택한 경우 다시 선택받음.
					System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 고객 번호입니다. 다시 선택해주세요." + RESET);
					break;
				}
				break;
			case 4: // 고객 전화번호 변경 메뉴를 선택한 경우
				switch (Member.selectMember()) { // 변경할 고객을 선택하고, 전화번호를 변경함.
				case 1:
					kim.editPhoneNum();
					break;
				case 2:
					lee.editPhoneNum();
					break;
				case 3:
					scott.editPhoneNum();
					break;
				default: // 올바르지 않은 고객을 선택한 경우 다시 선택받음.
					System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 고객 번호입니다. 다시 선택해주세요." + RESET);
					break;
				}
				break;
			case 9: // 고객 멤버십 관리 프로그램 종료 메뉴를 선택한 경우
				System.out.println(FONT_GREEN + "※ 알림 : 고객 멤버십 관리 메뉴를 닫고 프로그램을 종료합니다..." + RESET);
				return; // main() 메소드의 리턴 타입이 void 이지만, main() 메소드에서 return 문을 사용하면 프로그램을 종료하는 역할을 함. 즉, 고객 멤버십 관리 프로그램을 완전히 종료함.
			default: // 올바르지 않은 메뉴를 선택한 경우, 올바르지 않은 메뉴라는 문구를 출력하고 메뉴를 다시 선택받음.
				System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 메뉴 번호입니다. 다시 선택해주세요." + RESET);
				break;
			}
		}
	}
}
