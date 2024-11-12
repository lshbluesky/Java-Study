package week11.treemap.student;

public class StdMain {
	public static void main(String[] args) {
		StudentManager stdManager = new StudentManager();

		// 학생 추가
		stdManager.addStudent(new Student("CS101", "강산", "컴퓨터과학과"));
		stdManager.addStudent(new Student("M102", "황민", "수학과"));
		stdManager.addStudent(new Student("PH103", "수희", "물리학과"));

		// 모든 학생 정보 출력
		stdManager.displayAllStudents();

		// 특정 학생 ID로 조회
		stdManager.getStudentById("M102"); // 황민 정보를 조회
		stdManager.getStudentById("S105"); // 존재하지 않는 ID 조회
	}
}
