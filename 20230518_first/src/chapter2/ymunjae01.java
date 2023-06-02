package chapter2;

import java.util.Scanner;

public class ymunjae01 {
	private void praivate() {
	}

	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사칙연산자 무엇을 넣고 싶나요? : ");

		char operator = sc.next().charAt(0);

		int num1 = 10;
		int num2 = 2;
		int dab;

		if (operator == '+') {

		} else if (operator == '-') {
			dab = num1 - num2;
		} else if (operator == '*') {
			dab = num1 * num2;
		} else if (operator == '%') {
			dab = num1 / num2;
		} else {
			System.out.println("이게 맞는지 다시생각해보세요.");
		}

	}

}