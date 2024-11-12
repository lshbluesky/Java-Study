package week11.hashmap.searchstudent;

import java.util.HashMap;

public class StudentManager {
	private HashMap<String, Student> stdHashMap = new HashMap<>();

	// 학생 정보 추가 및 수정
	public void addStudent(Student std) {
		stdHashMap.put(std.getId(), std); // 만약, 같은 ID가 존재하면 덮어 쓰면서 수정
		System.out.println("※ 학생 " + std + " 이(가) 추가되었습니다.");
	}

	// 학번(ID)으로 특정 학생 조회
	public void getStudentById(String id) {
		Student std = stdHashMap.get(id);

		if (std != null) {
			System.out.println("※ 학생 " + std + " 이(가) 조회되었습니다.");
		} else {
			System.out.println("※ 학번 [" + id + "] 에 해당하는 학생이 존재하지 않습니다.");
		}
	}

	// 전체 학생 정보 출력
	public void displayAllStudents() {
		if (stdHashMap.isEmpty())
			System.out.println("※ 학생 정보가 없습니다.");
		else {
			System.out.println("※ 전체 학생 정보");
			System.out.println("※ 현재 등록되어 있는 학생 인원수 : " + stdHashMap.size());
			for (Student std : stdHashMap.values()) {
				System.out.println(std);
			}
		}
	}
}
