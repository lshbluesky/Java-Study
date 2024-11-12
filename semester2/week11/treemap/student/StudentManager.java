package week11.treemap.student;

import java.util.TreeMap;

public class StudentManager {
	private TreeMap<String, Student> stdTreeMap = new TreeMap<>();

	// 학생 정보 추가 및 수정
	public void addStudent(Student std) {
		stdTreeMap.put(std.getId(), std); // 만약, 같은 ID가 존재하면 덮어 쓰면서 수정
		System.out.println("※ 학생 " + std + " 이(가) 추가되었습니다.");
	}

	// 학번(ID)으로 특정 학생 조회
	public void getStudentById(String id) {
		Student std = stdTreeMap.get(id);

		if (std != null) {
			System.out.println("※ 학생 " + std + " 이(가) 조회되었습니다.");
		} else {
			System.out.println("※ 학번 [" + id + "] 에 해당하는 학생이 존재하지 않습니다.");
		}
	}

	// 전체 학생 정보 출력
	public void displayAllStudents() {
		if (stdTreeMap.isEmpty())
			System.out.println("※ 학생 정보가 없습니다.");
		else {
			System.out.println("※ 전체 학생 정보");
			System.out.println("※ 현재 등록되어 있는 학생 인원수 : " + stdTreeMap.size());
			for (Student std : stdTreeMap.values()) {
				System.out.println(std);
			}
		}
	}
}
