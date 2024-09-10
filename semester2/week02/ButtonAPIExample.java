package week02;

class Button {
	OnClickListener ocl;

	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}

	interface OnClickListener {
		public abstract void onClick();
	}

	void click() {
		ocl.onClick();
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {
		Button button1 = new Button();
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자1. 음악 재생");
			}
		});
		button1.click();

		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자2. 네이버 접속");
			}
		});
		button2.click();
	}
}
