package kh.lclass.test;

import java.util.Scanner;

public class TestExam {
	public static void main(String[] args) {
		new TestExam().printGuguda();
	}

	public void printGuguda() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단을 입력 (2~9단까지) : ");
		int dan = sc.nextInt();

		int su = 1;

		if (dan >1 && dan < 10)  {
			while (su <10 ) {
				System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
				su++;
			}
		}
	}
}