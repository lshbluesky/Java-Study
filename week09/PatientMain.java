package week09;

class Patient {
	String name;
	int age;
	String disease;
	
	public Patient() {
		disease = "Blocked";
	}
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Patient(String name, int age, String disease) {
		this(name, age);
		this.disease = disease;
	}
	
	public void showPatient() {
		System.out.println("환자 이름 : " + name);
		System.out.println("환자 나이 : " + age);
		System.out.println("환자 질병명 : " + disease);
		System.out.println();
	}
}

public class PatientMain {
	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.showPatient();
		Patient p2 = new Patient("Kim", 23);
		p2.showPatient();
		Patient p3 = new Patient("Lee", 24, "감기");
		p3.showPatient();
	}
}
