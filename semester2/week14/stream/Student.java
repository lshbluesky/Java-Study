package week14.stream;

public class Student {
	private int id; // 학번
	private String name; // 이름
	private int java; // Java 성적
	private int c; // C 성적
	private int python; // Python 성적

	public Student(int id, String name, int java, int c, int python) {
		this.id = id;
		this.name = name;
		this.java = java;
		this.c = c;
		this.python = python;
	}

	public int getId() {	return id;	}

	public String getName() {	return name;	}

	public int getJava() {	return java;	}

	public int getC() {	return c;	}

	public int getPython() {	return python;	}

	public void setJava(int java) {	this.java = java;	}

	public void setC(int c) {	this.c = c;	}

	public void setPython(int python) {	this.python = python;	}

	public int getTotalScore() {	return java + c + python;	}

	public double getAverageScore() {	return getTotalScore() / 3.0;	}

	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s, Java: %d, C: %d, Python: %d, Total: %d, Avg: %.2f", id, name, java, c,
				python, getTotalScore(), getAverageScore());
	}
}
