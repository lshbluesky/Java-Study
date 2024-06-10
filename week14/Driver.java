package week14;

import java.util.Random;
import java.util.Scanner;
/* 두 명의 선수가 주사위 한 쌍을 던지고 눈들의 합을 비교하여 승자를 결정하는 간단한 게임을 모의 실험하는 프로그램을 작성하라.
 * 각 선수는 이름이 있다. 선수들은 차례로 주사위를 던진다.
 * 첫 번째 선수의 주사위 눈들의 합이 두 번째 선수의 주사위 눈들의 합보다 크다면 첫 번째 선수가 이겼다라는 메시지를 출력한다.
 * 만약, 두 선수들의 눈들의 합이 같다면 비겼다라는 메시지를 출력한다.
 * 선수들이 게임을 그만두겠다고 할 때까지 게임은 계속되어야 한다.
 */
class PairOfDice {
	int facevalue1; // 첫 번째 주사위 숫자
	int facevalue2; // 두 번째 주사위 숫자

	PairOfDice() {
		super();
		this.facevalue1 = 0;
		this.facevalue2 = 0;
	}

	void throwDice() {
		Random rand = new Random();
		facevalue1 = rand.nextInt(6) + 1;
		facevalue2 = rand.nextInt(6) + 1;
	}

	int getFaceValue1() {
		return facevalue1;
	}

	int getFaceValue2() {
		return facevalue2;
	}
}

class Player {
	private String name;
	int total;

	Player(String name) {
		super();
		this.name = name;
		this.total = 0;
	}

	void setName(String name) {
		this.name = name;
	}

	void throwDiceAndSaveScore(PairOfDice dice) {
		this.total = dice.facevalue1 + dice.facevalue2;
	}

	String getName() {
		return name;
	}

	int getScore() {
		return total;
	}
}

public class Driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PairOfDice dice = new PairOfDice();
		Player p1 = new Player("Kim");
		Player p2 = new Player("Lee");

		while (true) {
			dice.throwDice();
			p1.throwDiceAndSaveScore(dice);
			System.out.println("▦ [" + p1.getName() + "] 님의 주사위 눈 : " + dice.getFaceValue1() + ", " + dice.getFaceValue2() + " => 총점 : " + p1.total);

			dice.throwDice();
			p2.throwDiceAndSaveScore(dice);
			System.out.println("▦ [" + p2.getName() + "] 님의 주사위 눈 : " + dice.getFaceValue1() + ", " + dice.getFaceValue2() + " => 총점 : " + p2.total);

			if (p1.total > p2.total) {
				System.out.println("▦ [" + p1.getName() + "] 님이 이겼습니다.");
			} else if (p1.total < p2.total) {
				System.out.println("▦ [" + p2.getName() + "] 님이 이겼습니다.");
			} else if (p1.total == p2.total)
				System.out.println("비겼습니다.");

			System.out.print("▦ 게임을 계속 진행할까요? (아니요 입력 시 종료) : ");
			if (in.nextLine().equals("아니요")) {
				break;
			}
		}
	}
}
