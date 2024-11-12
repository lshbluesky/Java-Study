package week11.treeset.dictionary;

public class Dictionary2 {
	String english;
	String korean;

	public Dictionary2(String english, String korean) {
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
}
