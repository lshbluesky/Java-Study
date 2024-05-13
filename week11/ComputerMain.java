package week11;

abstract class Computer {
	String cpu, mb, gpu;
	int ram;

	abstract void showInfo();
}

class Desktop extends Computer {
	Desktop() {
		this.cpu = "Intel 7th Gen Kaby Lake Core i3-7100";
		this.mb = "Gigabyte GA-B250M-DS3H";
		this.ram = 8;
		this.gpu = "Intel HD Graphics 630";
	}

	void showInfo() {
		System.out.println("▦ CPU : " + cpu);
		System.out.println("▦ M/B : " + mb);
		System.out.println("▦ RAM : " + ram + "GB");
		System.out.println("▦ GPU : " + gpu);
		System.out.println();
	}
}

class Laptop extends Computer {
	int battery;

	Laptop() {
		this.cpu = "Intel 11th Gen Tiger Lake Core i5-1135G7";
		this.mb = "Samsung NT750XDA-KF59U";
		this.ram = 8;
		this.gpu = "Intel Iris Xe Graphics";
		this.battery = 43;
	}

	void showInfo() {
		System.out.println("▦ CPU : " + cpu);
		System.out.println("▦ M/B : " + mb);
		System.out.println("▦ RAM : " + ram + "GB");
		System.out.println("▦ GPU : " + gpu);
		System.out.println("▦ 배터리 용량 : " + battery + "Wh");
		System.out.println();
	}
}

public class ComputerMain {
	public static void main(String[] args) {
		Desktop com = new Desktop();
		Laptop nb = new Laptop();

		com.showInfo();
		nb.showInfo();
	}
}
