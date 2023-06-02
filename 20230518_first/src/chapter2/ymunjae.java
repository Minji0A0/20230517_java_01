package chapter2;

import java.util.Scanner;

public class ymunjae {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] arge) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		System.out.print("이번달 핸드폰 요금 납부금액 : ");
		int gold1 = sc.nextInt();

		if (gold1 <= num1) {
			System.out.println("이번달 미납금액 : " + (num1 - gold1));
			if (gold1 <= num2) {
				System.out.println("미납급액은 다음달에 이월됩니다.");
			}
		}

	}

}
