package week13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard {
	   private int kor; // 국어 점수
	   private int eng; // 영어 점수
	   private int math; // 수학 점수

	   public ReportCard(int k, int e, int m) {
	      kor = k;
	      eng = e;
	      math = m;
	   }
	   public int getKor() { return kor; }
	   public int getEng() { return eng; }
	   public int getMath() { return math; }
	@Override
	public String toString() {
		return "ReportCard [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	   
}

public class GradeAverage {
	public static void main(String[] args) {
		   ReportCard[] cards = {
		      new ReportCard(70, 80, 90),
		      new ReportCard(90, 80, 70),
		      new ReportCard(80, 80, 80)
		   };

		   // ReportCard 인스턴스로 이뤄진 스트림 생성
		   Stream<ReportCard> sr = Arrays.stream(cards);

		   // 학생들의 점수 정보로 이뤄진 스트림 생성
		   IntStream si = sr.flatMapToInt(
		      r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		   
		   // 평균을 구하기 위한 최종 연산 average 진행
		   double avg = si.average().getAsDouble();
		   System.out.println("avg. " + avg);
		   
		   var cards2 = List.of(
				      new ReportCard(70, 80, 90),
				      new ReportCard(90, 88, 70),
				      new ReportCard(80, 86, 80));
		   
		   cards2.stream()
	       .sorted(Comparator.comparing(ReportCard::getEng)) // 영어 점수 기준으로 정렬
//	       .sorted(Comparator.comparing(ReportCard::getEng).reversed())
	       .forEach(r -> System.out.println(r));
		}

}
