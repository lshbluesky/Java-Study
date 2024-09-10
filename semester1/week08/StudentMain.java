package week08;

class Student {
	String name;
	int age;
	int sid;

	Student() {
	}

	Student(String name, int age, int sid) {
		this.name = name;
		this.age = age;
		this.sid = sid;
	}

	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + sid);
		System.out.println();
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Lee";
		s1.age = 24;
		s1.sid = 20123456;
		s1.printInfo();

		Student s2 = new Student("Kim", 23, 21098765);
		s2.printInfo();
	}
}
