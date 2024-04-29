package week09;

import java.util.Arrays;

class Stack {
	int[] data = new int[5];
	int index; // 마지막 요소의 위치

	public Stack() {
		index = -1;
	}
	
	boolean stackIsEmpty() {
		if (index == -1) {
			System.out.println("스택이 비어 있습니다.");
			return true;
		}
		return false;
	}

	boolean stackIsFull() {
		if (index == data.length - 1) {
			System.out.println("스택이 꽉찼습니다.");
			return true;
		}
		return false;
	}

	void push(int d) {
		if (stackIsFull())
			return;
		else {
			index++;
			data[index] = d;
			System.out.println(d + " 삽입");
		}
	}

	int pop() {
		if (stackIsEmpty())
			return 0;
		else {
			int tmp = data[index];
			data[index] = 0;
			index--;
			System.out.println(tmp + " 추출");
			return tmp;
		}
	}

	void stackSize() {
		System.out.println("현재 스택의 데이터 개수 : " + data.length);
	}

	void printStack() {
		System.out.println(Arrays.toString(data));
	}
}

public class StackMain {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.printStack();
		
		s.push(4);
		s.push(5);
		s.printStack();
		s.push(6);
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.printStack();
		s.pop();
	}
}
