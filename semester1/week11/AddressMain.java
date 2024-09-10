package week11;

import java.util.Scanner;

class Address {
	private String name, phone, address;

	Address() {
		name = null;
		phone = "010-0000-0000";
		address = null;
	}

	Address(String name, String phone, String address) {
		this();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	void editPhone() {
		Scanner in = new Scanner(System.in);
		System.out.print("▦ [" + this.name + "] 변경할 전화번호 입력 :");
		this.phone = in.nextLine();
		System.out.println("▦ [" + this.name + "] 전화번호가 변경되었습니다.");
	}

	void showInfo() {
		System.out.println("▦ 이름 : " + name);
		System.out.println("▦ 전화번호 : " + phone);
		System.out.println("▦ 주소 : " + address);
		System.out.println();
	}

	static void findAddress(Address[] addr) {
		Scanner in = new Scanner(System.in);
		System.out.print("▦ 검색할 이름 입력 : ");
		String findName = in.nextLine();
		boolean isFound = false;

		for (int i = 0; i < addr.length; i++) {
			if (findName.equals(addr[i].name)) {
				isFound = true;
				System.out.println("▦ 알림 : [" + findName + "] 을 찾았습니다.");
				addr[i].showInfo();
				break;
			}
		}
		if (!isFound)
			System.out.println("▦ 오류 : [" + findName + "] 을 찾지 못했습니다.");
	}

	static int showAddressMenu() {
		Scanner in = new Scanner(System.in);
		int menu;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("▦ 주소록 메뉴 ▦");
		System.out.println("▦ 1. 주소록 정보 출력 | 2. 주소록 전화번호 수정 | 3. 주소록 이름 검색 | 9. 주소록 종료 ▦");
		System.out.print("▦ 메뉴 선택 : ");
		menu = in.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		return menu;
	}
}

public class AddressMain {
	public static void main(String[] args) {
		Address[] addr = new Address[3]; // 객체 배열
		addr[0] = new Address("Kim", "010-1111-2222", "서울");
		addr[1] = new Address("Lee", "010-3333-5555", "경기");
		addr[2] = new Address("Park", "010-7777-8888", "인천");

		while (true) {
			switch (Address.showAddressMenu()) {
			case 1:
				for (int i = 0; i < addr.length; i++) {
					addr[i].showInfo();
				}
				break;
			case 2:
				addr[0].editPhone();
				addr[1].editPhone();
				addr[2].editPhone();
				break;
			case 3:
				Address.findAddress(addr);
				break;
			case 9:
				System.out.println("▦ 주소록 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("▦ 올바르지 않은 메뉴 번호입니다. 다시 선택해주세요.");
				break;
			}
		}
	}
}
