package exam;

public class SmartPhone {
	private Battery battery;

	public SmartPhone() {
		this.battery = new Battery();
	}

	public void runSmartPhone() {
		battery.startConsume();
	}

	class Battery {
		void startConsume() {
			System.out.println("배터리 소모 시작함");
		}
	}

	public static void main(String[] args) {
		SmartPhone myBattery = new SmartPhone();
		myBattery.runSmartPhone();
	}
}
