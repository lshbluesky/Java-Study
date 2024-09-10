package iot_home;

import java.util.Scanner;

abstract class SmartHome { // SmartHome 클래스 정의, 스마트홈과 연결된 장치(에어컨, 보일러 등)에서 공통으로 사용되는 필드와 메소드를 정의함.
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	public static final String FONT_BLUE = "\u001B[34m";
	public static final String FONT_PURPLE = "\u001B[35m";
	public static final String FONT_CYAN = "\u001B[36m";

	boolean isPowerOn; // 스마트홈과 연결된 장치(에어컨, 보일러 등)의 켜짐 여부 저장
	int cur_temp; // 현재 실내 온도
	int set_temp; // 사용자가 설정한 온도
	String room; // 방의 위치
	
	SmartHome() { // SmartHome 추상 클래스의 생성자, 추상 클래스는 직접 객체를 생성할 수 없지만, super() 메소드를 통하여 사용하는 경우도 있음.
		cur_temp = 0; // cur_temp 필드의 값을 0으로 초기화.
		set_temp = 0; // set_temp 필드의 값을 0으로 초기화.
	}
	
	void powerOn() { // 스마트홈과 연결된 장치(에어컨, 보일러 등)의 전원을 켜는 메소드, 자식 클래스에서는 메소드 오버라이딩하여 사용함.
		isPowerOn = true; // isPowerOn 필드에 true 저장.
	}

	void powerOff() { // 스마트홈과 연결된 장치(에어컨, 보일러 등)의 전원을 끄는 메소드, 자식 클래스에서는 메소드 오버라이딩하여 사용함.
		isPowerOn = false; // isPowerOn 필드에 false 저장.
	}
	
	abstract void upTemp(); // 스마트홈과 연결된 장치(에어컨, 보일러 등)의 설정 온도를 1도 올리는 추상 메소드, 하위 클래스에서 메소드 오버라이딩하여 내용을 구현하고 사용함.
	abstract void downTemp(); // 스마트홈과 연결된 장치(에어컨, 보일러 등)의 설정 온도를 1도 내리는 추상 메소드, 하위 클래스에서 메소드 오버라이딩하여 내용을 구현하고 사용함.
	
	static int showSmartHomeMenu() { // 스마트홈 통합 관리 메뉴 정보를 출력하고, 에어컨/보일러를 제어할 방 또는 메뉴를 선택하여 해당 메뉴 번호를 반환하는 메소드.
		Scanner in = new Scanner(System.in);
		int menu; // 메뉴 번호를 입력받아서 저장할 menu 변수 정의.
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(FONT_GREEN + "▦ 스마트홈 통합 관리 메뉴 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 에어컨 | 1. 거실 | 2. 안방 | 3. 공부방 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 보일러 | 4. 거실 | 5. 안방 | 6. 공부방 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 기타 메뉴 | 8. 각 방의 에어컨 및 보일러 작동 상태 확인 | 9. 스마트홈 통합 관리 프로그램 종료 ▦" + RESET);
		System.out.print("▦ 에어컨/보일러를 제어할 방 또는 메뉴를 선택해주세요. : ");
		menu = in.nextInt();
		System.out.println("--------------------------------------------------------------------------------------");
		return menu;
	}
}

class Boiler extends SmartHome { // SmartHome 클래스를 상속 받으면서 Boiler 클래스 정의, 보일러 및 난방 기능에 필요한 필드와 메소드를 정의.
	Boiler() { // Boiler 클래스의 기본 생성자, 방의 현재 실내 온도는 19도라 가정하고, 보일러가 켜지면 기본으로 설정되는 난방 온도를 22도로 설정함.
		cur_temp = 19;
		set_temp = 22;
	}

	Boiler(String room) { // Boiler 클래스의 기본 생성자를 먼저 호출하여 실내 온도, 난방 온도를 기본 설정값으로 초기화하고 매개 변수로 전달받은 방의 위치를 room 필드에 저장함.
		this();
		this.room = room;
	}
	
	void powerOn() { // 보일러의 전원을 켜는 메소드, isPowerOn 필드에 false 저장, 보일러를 켜는 알림 문구를 출력.
		isPowerOn = true;
		System.out.println(FONT_GREEN + "※ 알림 : [" + room + "] 보일러를 켭니다." + RESET);
	}

	void powerOff() { // 보일러의 전원을 끄는 메소드, isPowerOn 필드에 false 저장, 보일러를 끄는 알림 문구를 출력.
		System.out.println(FONT_GREEN + "※ 알림 : [" + room + "] 보일러를 끕니다." + RESET);
		isPowerOn = false;
	}

	void upTemp() { // 난방 설정 온도를 1도 올리는 메소드, 난방 온도는 최대 30도까지 설정 가능.
		if (set_temp >= 30)
			System.out.println(FONT_PURPLE + "※ 알림 : 최대 설정 온도는 30도까지 설정 가능합니다." + RESET);
		else {
			set_temp += 1;
			System.out.println(FONT_GREEN + "※ 설정된 난방 온도 : " + set_temp + RESET);
		}
	}

	void downTemp() { // 난방 설정 온도를 1도 낮추는 메소드, 난방 온도는 최소 15도부터 설정 가능.
		if (set_temp <= 15)
			System.out.println(FONT_PURPLE + "※ 알림 : 최저 설정 온도는 15도부터 설정 가능합니다." + RESET);
		else {
			set_temp -= 1;
			System.out.println(FONT_GREEN + "※ 설정된 난방 온도 : " + set_temp + RESET);
		}
	}

	void showInfo() { // 현재 방의 온도와 보일러에 설정된 난방 온도를 출력.
		System.out.println(FONT_BLUE + "▦ 현재 보일러 설정 정보 ▦");
		System.out.println("※ 방 위치 : " + room);
		System.out.println("※ 현재 온도 : " + cur_temp);
		System.out.println("※ 난방 온도 : " + set_temp + RESET);
	}

	static void boControl(Boiler bo) { // Boiler 클래스의 객체를 매개 변수로 받고, 이를 통하여 보일러를 제어하는 static 메소드.
		Scanner in = new Scanner(System.in);
		
		while (bo.isPowerOn) { // 보일러가 켜진 상태에서만 제어가 가능하도록 함, 메뉴에서 보일러를 끈 경우에는 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("▦ [" + bo.room + "] 보일러 메뉴 ▦ 1. 난방 온도 올림 | 2. 난방 온도 내림 | 3. 현재 설정 정보 표시 | 4. 보일러 끄기 | 9. 이전 메뉴로 돌아가기 ▦"); // 보일러 제어 메뉴 출력
			System.out.print("▦ 메뉴 선택 : ");
			int menu = in.nextInt(); // 메뉴 번호를 입력받아서 저장할 menu 변수 정의.
			
			switch (menu) {
			case 1: // 보일러 난방 온도 올림 메뉴를 선택한 경우
				bo.upTemp();
				break;
			case 2: // 보일러 난방 온도 내림 메뉴를 선택한 경우
				bo.downTemp();
				break;
			case 3: // 현재 방에 설정된 보일러의 설정 정보 표시 메뉴를 선택한 경우
				bo.showInfo();
				break;
			case 4: // 현재 방의 보일러를 끄는 메뉴를 선택한 경우, 보일러가 꺼짐과 동시에 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
				bo.powerOff();
				break;
			case 9: // 현재 방의 보일러를 끄지 않고, 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아가기 메뉴를 선택한 경우
				return; // boControl 메소드를 종료하여 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
			default: // 올바르지 않은 메뉴를 선택한 경우, 올바르지 않은 메뉴라는 문구를 출력하고 메뉴를 다시 선택받음.
				System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 메뉴입니다. 다시 선택해주세요." + RESET);
				break;
			}
		}
	}
}

class AirCon extends SmartHome { // SmartHome 클래스를 상속 받으면서 AirCon 클래스 정의, 에어컨 및 냉방 기능에 필요한 필드와 메소드를 정의.
	int wind_power; // 에어컨은 바람 세기를 저장할 필드가 추가로 필요하므로, 바람 세기 필드를 정의함.

	AirCon() { // AirCon 클래스의 기본 생성자, 방의 현재 실내 온도는 27도라 가정하고, 에어컨이 켜지면 기본으로 설정되는 희망 온도를 23도로 설정하고 기본 바람 세기는 중으로 설정함.
		cur_temp = 27;
		set_temp = 23;
		wind_power = 2;
	}

	AirCon(String room) { // AirCon 클래스의 기본 생성자를 먼저 호출하여 실내 온도, 희망 온도, 바람 세기를 기본 설정값으로 초기화하고 매개 변수로 전달받은 방의 위치를 room 필드에 저장함.
		this();
		this.room = room;
	}
	
	void powerOn() { // 에어컨의 전원을 켜는 메소드, isPowerOn 필드에 true 저장, 에어컨을 켜는 알림 문구를 출력.
		isPowerOn = true;
		System.out.println(FONT_GREEN + "※ 알림 : [" + room + "] 에어컨을 켭니다." + RESET);
	}

	void powerOff() { // 에어컨의 전원을 끄는 메소드, isPowerOn 필드에 false 저장, 에어컨을 끄는 알림 문구를 출력.
		System.out.println(FONT_GREEN + "※ 알림 : [" + room + "] 에어컨을 끕니다." + RESET);
		isPowerOn = false;
	}

	void upTemp() { // 에어컨의 희망 온도를 1도 올리는 메소드, 희망 온도는 최대 30도까지 설정 가능.
		if (set_temp >= 30)
			System.out.println(FONT_PURPLE + "※ 알림 : 최대 설정 온도는 30도까지 설정 가능합니다." + RESET);
		else {
			set_temp += 1;
			System.out.println(FONT_GREEN + "※ 설정된 희망 온도 : " + set_temp + RESET);
		}
	}

	void downTemp() { // 에어컨의 희망 온도를 1도 내리는 메소드, 희망 온도는 최소 18도부터 설정 가능.
		if (set_temp <= 18)
			System.out.println(FONT_PURPLE + "※ 알림 : 최저 설정 온도는 18도부터 설정 가능합니다." + RESET);
		else {
			set_temp -= 1;
			System.out.println(FONT_GREEN + "※ 설정된 희망 온도 : " + set_temp + RESET);
		}
	}

	void setWindPower(int n) { // 에어컨의 바람 세기를 변경하는 메소드.
		if (n < 1 || n > 3)
			System.out.println(FONT_RED + "※ 오류 : 설정할 수 없는 바람 세기입니다." + RESET);
		else {
			wind_power = n;
			System.out.println(FONT_GREEN + "※ 설정된 바람 세기 : " + (wind_power == 1 ? "약" : wind_power == 2 ? "중" : "강") + RESET);
		}
	}

	void showInfo() { // 현재 온도와 에어컨에 설정된 온도, 바람 세기 정보를 출력.
		System.out.println(FONT_BLUE + "▦ 현재 에어컨 설정 정보 ▦");
		System.out.println("※ 에어컨 방 위치 : " + room);
		System.out.println("※ 현재 온도 : " + cur_temp);
		System.out.println("※ 희망 온도 : " + set_temp);
		System.out.println("※ 바람 세기 : " + (wind_power == 1 ? "약" : wind_power == 2 ? "중" : "강") + RESET);
	}

	static void acControl(AirCon ac) { // AirCon 클래스의 객체를 매개 변수로 받고, 이를 통하여 에어컨을 제어하는 static 메소드.
		Scanner in = new Scanner(System.in);
		
		while (ac.isPowerOn) { // 에어컨이 켜진 상태에서만 제어가 가능하도록 함, 메뉴에서 에어컨을 끈 경우에는 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("▦ [" + ac.room + "] 에어컨 메뉴 ▦ 1. 설정 온도 올림 | 2. 설정 온도 내림 | 3. 바람 세기 조절 | 4. 현재 설정 정보 표시 | 5. 에어컨 끄기 | 9. 이전 메뉴로 돌아가기 ▦"); // 에어컨 제어 메뉴 출력
			System.out.print("▦ 메뉴 선택 : ");
			int menu = in.nextInt(); // 메뉴 번호를 입력받아서 저장할 menu 변수 정의.
			
			switch (menu) {
			case 1: // 에어컨 설정 온도 올림 메뉴를 선택한 경우
				ac.upTemp();
				break;
			case 2: // 에어컨 설정 온도 내림 메뉴를 선택한 경우
				ac.downTemp();
				break;
			case 3: // 에어컨 바람 세기 조절 메뉴를 선택한 경우
				System.out.println("▦ 에어컨 바람 세기 설정 메뉴 => 1: 약 | 2: 중 | 3: 강");
				System.out.print("▦ 희망하는 바람 세기 선택 : ");
				ac.setWindPower(in.nextInt()); // 사용자로부터 바람 세기에 해당하는 번호를 입력받고, 이를 매개변수로 하여 에어컨 바람 세기를 조절하는 setWindPower 메소드를 호출.
				break;
			case 4: // 현재 방에 설정된 에어컨의 설정 정보 표시 메뉴를 선택한 경우
				ac.showInfo();
				break;
			case 5: // 현재 방의 에어컨을 끄는 메뉴를 선택한 경우, 에어컨이 꺼짐과 동시에 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
				ac.powerOff();
				break;
			case 9: // 현재 방의 에어컨을 끄지 않고, 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아가기 메뉴를 선택한 경우
				return; // acControl 메소드를 종료하여 이전 메뉴(스마트홈 통합 관리 메뉴)로 돌아감.
			default: // 올바르지 않은 메뉴를 선택한 경우, 올바르지 않은 메뉴라는 문구를 출력하고 메뉴를 다시 선택받음.
				System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 메뉴입니다. 다시 선택해주세요." + RESET);
				break;
			}
		}
	}
}

public class SmartHomeMain {
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	
	public static void main(String[] args) { // main 메소드
		AirCon ac1 = new AirCon("거실"); // 거실 에어컨 객체 생성
		AirCon ac2 = new AirCon("안방"); // 안방 에어컨 객체 생성
		AirCon ac3 = new AirCon("공부방"); // 공부방 에어컨 객체 생성
		Boiler bo1 = new Boiler("거실"); // 거실 보일러 객체 생성
		Boiler bo2 = new Boiler("안방"); // 안방 보일러 객체 생성
		Boiler bo3 = new Boiler("공부방"); // 공부방 보일러 객체 생성
		
		while (true) {
			switch (SmartHome.showSmartHomeMenu()) { // 스마트홈 통합 관리 메뉴 정보를 표시하는 static 메소드를 호출하고, 선택된 방/메뉴 번호를 반환받아서 그에 맞는 기능을 실행.
			case 1: // 거실의 에어컨을 켜고 제어하는 메뉴를 선택한 경우
				ac1.powerOn();
				AirCon.acControl(ac1);
				break;
			case 2: // 안방의 에어컨을 켜고 제어하는 메뉴를 선택한 경우
				ac2.powerOn();
				AirCon.acControl(ac2);
				break;
			case 3: // 공부방의 에어컨을 켜고 제어하는 메뉴를 선택한 경우
				ac3.powerOn();
				AirCon.acControl(ac3);
				break;
			case 4: // 거실의 보일러를 켜고 제어하는 메뉴를 선택한 경우
				bo1.powerOn();
				Boiler.boControl(bo1);
				break;
			case 5: // 안방의 보일러를 켜고 제어하는 메뉴를 선택한 경우
				bo2.powerOn();
				Boiler.boControl(bo2);
				break;
			case 6: // 공부방의 보일러를 켜고 제어하는 메뉴를 선택한 경우
				bo3.powerOn();
				Boiler.boControl(bo3);
				break;
			case 8: // 각 방의 에어컨&보일러 작동 상태 확인 메뉴를 선택한 경우, 각 방의 에어컨 및 보일러 객체에서 boolean 타입의 isPowerOn 필드에 저장된 값으로 켜짐/꺼짐 여부를 출력.
				System.out.println(FONT_GREEN + "▦ 각 방의 에어컨 및 보일러 작동 상태 확인 메뉴 ▦" + RESET);
				System.out.println("※ 거실 에어컨 : " + (ac1.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				System.out.println("※ 안방 에어컨 : " + (ac2.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				System.out.println("※ 공부방 에어컨 : " + (ac3.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				System.out.println("※ 거실 보일러 : " + (bo1.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				System.out.println("※ 안방 보일러 : " + (bo2.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				System.out.println("※ 공부방 보일러 : " + (bo3.isPowerOn? FONT_GREEN + "[O] 켜짐" + RESET : "[X] 꺼짐"));
				break;
			case 9: // 스마트홈 통합 관리 메뉴를 종료한 경우, 이 메뉴를 선택하면 스마트홈 통합 관리 프로그램을 완전히 종료함.
				System.out.println(FONT_GREEN + "※ 알림 : 스마트홈 통합 관리 메뉴를 닫고 프로그램을 종료합니다..." + RESET);
				return; // main() 메소드의 리턴 타입이 void 이지만, main() 메소드에서 return 문을 사용하면 프로그램을 종료하는 역할을 함. 즉, 스마트홈 통합 관리 프로그램을 완전히 종료함.
			default: // 올바르지 않은 메뉴를 선택한 경우, 올바르지 않은 메뉴라는 문구를 출력하고 메뉴를 다시 선택받음.
				System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 방/메뉴 번호입니다. 다시 선택해주세요." + RESET);
				break;
			}
		}
	}
}
