package cafe;

import java.util.Scanner;

class Coffee { // Coffee 클래스 정의.
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	public static final String FONT_BLUE = "\u001B[34m";
	public static final String FONT_CYAN = "\u001B[36m";

	String name; // 커피/음료의 메뉴 이름
	int price; // 커피/음료의 가격
	boolean isIce; // 해당 커피/음료가 아이스 메뉴인지의 여부를 저장

	Coffee() { // Coffee 클래스의 기본 생성자, 매개 변수가 없으면 커피 이름을 null, 가격을 0으로 초기화.
		this.name = null;
		this.price = 0;
	}

	Coffee(String name, int price) { // Coffee 클래스의 생성자, 커피 이름과 가격을 매개 변수로 입력받음.
		this.name = name;
		this.price = price;
		this.isIce = false; // 아이스 메뉴인지 매개 변수로 명시하지 않으면, 기본적으로 따듯한 메뉴로 간주함.
	}

	Coffee(String name, int price, boolean isIce) { // Coffee 클래스의 생성자, 커피 이름과 가격, Ice 메뉴 여부를 매개 변수로 입력받음.
		this(name, price); // this() 메소드를 호출하여 메뉴 이름과 가격을 설정함.
		this.isIce = isIce;
	}

	void coffeeInfo() { // 커피/음료의 정보를 출력하는 메소드.
		System.out.println("※ 커피 이름 : " + name);
		System.out.println("※ Hot/Ice : " + (this.isIce ? FONT_BLUE + "Ice" + RESET : FONT_RED + "Hot" + RESET));
		String p = String.format("%,d", price); // 커피 가격은 천 단위 콤마를 표시.
		System.out.println("※ 커피 가격 : " + p + "원");
		System.out.println("");
	}
	
	static void findCoffee(Coffee[] arr) { // 객체 배열에서 커피/음료의 메뉴 이름으로 검색하고, 해당 커피/음료의 정보를 출력하는 메소드.
		Scanner in = new Scanner(System.in);
		System.out.print("▦ 검색할 커피 메뉴 입력 : ");
		String findName = in.nextLine(); // 검색할 커피 메뉴를 입력받음.
		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) { // 객체 배열의 길이만큼 반복하면서, 입력받은 커피 메뉴를 검색.
			if (findName.equals(arr[i].name)) { // 만약, 입력받은 커피 메뉴를 찾은 경우
				isFound = true; // isFound = true 저장
				System.out.println(FONT_GREEN + "▦ 알림 : [" + findName + "] 메뉴를 찾았으며, 정보는 다음과 같습니다." + RESET);
				arr[i].coffeeInfo(); // 찾은 메뉴의 정보를 출력.
				break;
			}
		}
		if (!isFound) // 위에서 메뉴를 찾지 못하면 오류 문구 출력, isFound = false 이므로, !isFound = true 임을 이용.
			System.out.println(FONT_RED + "▦ 오류 : [" + findName + "] 메뉴를 찾지 못했습니다." + RESET);
	}
	
	static void editCoffeePrice(Coffee[] arr) { // 객체 배열에서 커피/음료의 메뉴 이름으로 검색하고, 해당 커피/음료의 가격을 변경하는 메소드.
		Scanner in = new Scanner(System.in);
		System.out.println(FONT_GREEN + "▦ 커피/음료의 가격 변경 ▦" + RESET);
		System.out.print("▦ 가격을 변경할 커피 메뉴 입력 : ");
		String findName = in.nextLine(); // 가격을 변경할 커피 메뉴를 입력받음.
		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) { // 객체 배열의 길이만큼 반복하면서, 가격을 변경할 커피 메뉴를 검색.
			if (findName.equals(arr[i].name)) { // 만약, 가격을 변경할 커피 메뉴를 찾은 경우
				isFound = true; // isFound = true 저장
				System.out.println(FONT_CYAN + "▦ [" + arr[i].name + "] 메뉴의 변경 전 가격 [" + arr[i].price + "]" + RESET);
				System.out.print("▦ 변경할 가격 입력 : ");
				arr[i].price = in.nextInt(); // 찾은 메뉴의 가격을 변경.
				System.out.println(FONT_GREEN + "※ 알림 : [" + arr[i].name + "] 메뉴의 가격이 변경되었습니다." + RESET);
				break;
			}
		}
		if (!isFound) // 위에서 메뉴를 찾지 못하면 오류 문구 출력, isFound = false 이므로, !isFound = true 임을 이용.
			System.out.println(FONT_RED + "▦ 오류 : [" + findName + "] 메뉴를 찾지 못했습니다." + RESET);
	}
	
	static int showCoffeeControlMenu() {		
		Scanner in = new Scanner(System.in);
		int menu; // 메뉴 번호를 입력받아서 저장할 menu 변수 정의.
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(FONT_GREEN + "▦ 커피 메뉴 통합 관리 프로그램 ▦" + RESET);
		System.out.println(FONT_CYAN + "▦ 1. 모든 커피의 정보 출력 | 2. 커피 이름 검색 | 3. 커피 가격 변경 | 9. 커피 메뉴 통합 관리 프로그램 종료 ▦" + RESET);
		System.out.print("▦ 메뉴를 선택해주세요. : ");
		menu = in.nextInt();
		System.out.println("--------------------------------------------------------------------------------------");
		return menu;
	}
}

class Espresso extends Coffee { // Coffee 클래스를 상속받는 Espresso 클래스 정의.
	Espresso() { // Espresso 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("Espresso", 3000);
	}
}

class Americano extends Coffee { // Coffee 클래스를 상속받는 Americano 클래스 정의.
	Americano() { // Americano 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("Americano", 5000, false);
	}
}

class IceAmericano extends Coffee { // Coffee 클래스를 상속받는 IceAmericano 클래스 정의.
	IceAmericano() { // IceAmericano 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("IceAmericano", 5500, true);
	}
}

class CaffeLatte extends Coffee { // Coffee 클래스를 상속받는 CaffeLatte 클래스 정의.
	CaffeLatte() { // CaffeLatte 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("CaffeLatte", 6000, false);
	}
}

class CaffeMocha extends Coffee { // Coffee 클래스를 상속받는 CaffeMocha 클래스 정의.
	CaffeMocha() { // CaffeMocha 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("CaffeMocha", 6500, false);
	}
}

class BlueberrySmoothie extends Coffee { // Coffee 클래스를 상속받는 BlueberrySmoothie 클래스 정의.
	BlueberrySmoothie() { // BlueberrySmoothie 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("BlueberrySmoothie", 6800, true);
	}
}

class MangoSmoothie extends Coffee { // Coffee 클래스를 상속받는 MangoSmoothie 클래스 정의.
	MangoSmoothie() { // MangoSmoothie 클래스의 생성자, super() 메소드를 호출하여 부모 클래스의 생성자로 초기화.
		super("MangoSmoothie", 7000, true);
	}
}

public class CoffeeMain {
	// 콘솔에 출력되는 글자에 색상을 입히기 위한 상수 정의.
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_GREEN = "\u001B[32m";
	
	public static void main(String[] args) { // main() 메소드.
		Coffee[] coffeeMenu = new Coffee[] { // 모든 커피 메뉴를 담고 있는 객체 배열 정의. (다형성 특징 적용)
			new Espresso(),
			new Americano(),
			new IceAmericano(),
			new CaffeLatte(),
			new CaffeMocha(),
			new BlueberrySmoothie(),
			new MangoSmoothie()
		};
		
		while (true) {
			switch (Coffee.showCoffeeControlMenu()) { // 커피 메뉴 통합 관리 프로그램의 메뉴 정보를 표시하는 메소드를 호출하고, 선택된 메뉴 번호를 반환받아서 그에 맞는 기능을 실행.
			case 1: // 모든 커피의 정보 출력 메뉴를 선택한 경우
				for (int i = 0; i < coffeeMenu.length; i++) { // coffeeMenu 객체 배열에 담긴 모든 메뉴의 정보를 출력.
					coffeeMenu[i].coffeeInfo();
				}
				break;
			case 2: // 커피 이름 검색 메뉴를 선택한 경우
				Coffee.findCoffee(coffeeMenu); // coffeeMenu 객체 배열을 매개 변수로 전달하여, 커피 메뉴 이름을 검색하고 해당 메뉴의 정보를 출력하는 메소드 호출.
				break;
			case 3: // 커피 가격 변경 메뉴를 선택한 경우
				Coffee.editCoffeePrice(coffeeMenu); // coffeeMenu 객체 배열을 매개 변수로 전달하여, 커피 메뉴 이름을 검색하고 해당 메뉴의 가격을 변경하는 메소드 호출.
				break;
			case 9: // 커피 메뉴 통합 관리 프로그램 종료 메뉴를 선택한 경우, 이 메뉴를 선택하면 커피 메뉴 통합 관리 프로그램을 완전히 종료함.
				System.out.println(FONT_GREEN + "※ 알림 : 커피 메뉴 통합 관리 프로그램을 종료합니다..." + RESET);
				return;
			default: // 올바르지 않은 메뉴를 선택한 경우, 올바르지 않은 메뉴라는 문구를 출력하고 메뉴를 다시 선택받음.
				System.out.println(FONT_RED + "※ 오류 : 올바르지 않은 메뉴 번호입니다. 다시 선택해주세요." + RESET);
				break;
			}
		}
	}
}
