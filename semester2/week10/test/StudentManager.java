package week10.test;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> stdList = new ArrayList<Student>();

	// 학생 추가 : addStudent(Student std)
	public void addStudent(Student std) {
		if (!stdList.contains(std)) {
			stdList.add(std);
			System.out.println("※ " + std.getName() + "추가 완료.");
		} else
			System.out.println("※ " + std.getStdId() + "학생이 이미 존재합니다.");
	}

	// 학생 정보 검색 : searchStudent(String stdId)
	public void searchStudent(String stdId) {
		for (Student s : stdList) {
			if (s.getStdId().equals(stdId)) {
				System.out.println("※ " + s + " 검색 완료.");
				return;
			}
		}
		System.out.println("※ 해당 ID : " + stdId + " 을(를) 찾을 수 없습니다.");
	}

	// 학생 정보 삭제 : removeStudent(String stdId)
	public void removeStudent(String stdId) {
		for (Student s : stdList) {
			if (s.getStdId().equals(stdId)) {
				stdList.remove(s);
				System.out.println("※ 해당 ID : " + stdId + " 삭제 완료.");
				return; // removeStudent() 종료
			}
		}
		System.out.println("※ 해당 ID : " + stdId + " 을(를) 찾을 수 없습니다.");
	}

	// 전체 학생 정보 출력 : displayAllStudents()
	// 학생 정보가 비어있지 않은지 isEmpty() 메소드로 확인한 후에, 전체 학생 정보를 출력
	public void displayAllStudents() {
		if (stdList.isEmpty()) {
			System.out.println("학생 정보가 없습니다.");
		} else {
			System.out.println("※ 전체 학생 정보");
			System.out.println("※ 현재 등록되어 있는 학생 수 : " + stdList.size());
			for (Student s : stdList) {
				System.out.println(s);
			}
		}
	}
}
