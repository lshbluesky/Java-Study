package week11.treeset.dictionary;

public class Dictionary implements Comparable<Dictionary> {
	String english;
	String korean;

	public Dictionary(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getKorean() {
		return korean;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

	@Override
	public String toString() {
		return "Dictionary [english : " + english + ", korean : " + korean + "]";
	}

	@Override
	public int compareTo(Dictionary o) {
		return this.getEnglish().compareTo(o.getEnglish()); // 영어 사전 순으로 정렬
	}
}
