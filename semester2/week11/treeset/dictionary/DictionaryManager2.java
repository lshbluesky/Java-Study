package week11.treeset.dictionary;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DictionaryManager2 {
//	private TreeSet<Dictionary> dicTree = new TreeSet<Dictionary>();
	private TreeSet<Dictionary> dicTree;

	public DictionaryManager2() {
		dicTree = new TreeSet<Dictionary>(new Comparator<Dictionary>() {
			@Override
			public int compare(Dictionary o1, Dictionary o2) {
				// return -1*d1.getEnglish().compareTo(d2.getEnglish()); // 영어 사전 반대로 정렬
				return o1.getEnglish().compareTo(o2.getEnglish()); // 영어 사전 순으로 정렬
			}
		});
	}

	public void addWord(String english, String korean) {
		Dictionary tempDic = new Dictionary(english, korean);

		if (!dicTree.contains(tempDic)) {
			dicTree.add(tempDic);
			System.out.println("※ 단어 [" + tempDic.getEnglish() + "] 이(가) 추가되었습니다.");
		} else
			System.out.println("※ " + tempDic.getEnglish() + " 단어가 이미 존재합니다.");
	}

	public void updateWord(String english, String korean) {
		for (Dictionary d : dicTree) {
			if (d.getEnglish().equals(english)) {
				System.out.println("※ 수정 전 : " + d);
				d.setKorean(korean);
				System.out.println("※ 수정 후 : " + d + " 으로 단어 정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("※ 단어 : " + english + " 을(를) 찾을 수 없습니다.");
	}

	public void removeWord(String english) {
		for (Dictionary d : dicTree) {
			if (d.getEnglish().equals(english)) {
				dicTree.remove(d);
				System.out.println("※ 단어 [" + english + "] 이(가) 삭제되었습니다.");
				return;
			}
		}
		System.out.println("※ 단어 [" + english + "] 을(를) 찾을 수 없습니다.");
	}

	public void searchWord(String english) {
		for (Dictionary d : dicTree) {
			if (d.getEnglish().equals(english)) {
				System.out.println("※ " + d + "] 이(가) 검색되었습니다.");
				return;
			}
		}
		System.out.println("※ 단어 [" + english + "] 을(를) 찾을 수 없습니다.");
	}

	public void displayAllWords() {
		if (dicTree.isEmpty())
			System.out.println("※ 단어 사전에 데이터가 없습니다.");
		else {
			System.out.println("※ 전체 단어 정보");
			System.out.println("※ 현재 등록되어 있는 단어 개수 : " + dicTree.size());
			Iterator<Dictionary> iter = dicTree.iterator();
			while (iter.hasNext())
				System.out.println(iter.next());
		}
	}
}
