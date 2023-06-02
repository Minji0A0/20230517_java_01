package kh.lclass;

import java.util.Scanner;

public class TestIfLoop {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] areg) {
		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요. 정수 0~200 : ");
		int age = sc.nextInt();
		// if (age >=8 ) {
		// 8살이면 학교에 입학하였습니다.
		// 9살부터 -19살까지 학교에 다닙니다.
		// 그외 학교에 다니지 않습니다.
		// 19살이면 곧 졸업합니다.

		/*
		 * if (age == 8) { System.out.println("학교에 입학하였습니다."); } else if (age >= 9 &&
		 * age <= 19) { // 부정문을 쓸때에는 else if(!( age >= 9 && age <= 19 ))
		 * System.out.println("학교에 다닙니다."); } else if (age == 19) {
		 * System.out.println("곧 졸업합니다."); } else { System.out.println("학교에 다니지 않습니다.");
		 * }
		 */

		if (age >= 8 && age <= 19) {
			System.out.println("학교에 다닙니다.");
			if (age == 8) {
				System.out.println("학교에 입학하였습니다.");
			} else if (age == 19) {
				System.out.println("곧 졸업합니다.");
			}
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}

		System.out.println("=====================");
		System.out.println("공원입장료");
		System.out.println("나이를 입력해 주세요 : ");
		// 교재 97 flow chart 보면서 작성해주세요

		int age1;
		int charge = 0; // 오류를 줄이기 위해 초기값을 줘야 나중에 string 구문에 계산이 들어감
		age1 = sc.nextInt();

//		switch(age1 수식사용가능 ) {
//		case 1: // case (수식 사용 불가)
//		case 2:
//		case 3:}

		if (age1 < 8) {
			charge = 1000;
		} else if (age1 < 14) {
			charge = 2000;
		} else if (age1 < 20) {
			charge = 2500;
		} else if (age1 >= 20) {
			charge = 3000;

		}

		/*
		 * 8세미만 14세미만 20세 이상 15세 이상
		 */
		System.out.println("요금은 " + charge + "원 입니다.");
		System.out.println("=====================");


		System.out.println("=========학점=========");
		System.out.println("평균점수를 입력하세요:");
		int totalScore = sc.nextInt();
		int score = totalScore / 10; // 10으로 나눈 몫 (정수연산이므로 )
		// 100 ==> 10
		// 99 ==> 9, 90~99 ==> 9
		// 80 ~89 ==> 8
		// switch - case 문은 비교문의 규칙성이 있을때 사용하면 좋음
		switch (totalScore / 10) {
		case 10: // if
		case 9: //:~break;까지가 한개의 구문
			System.out.println("A학점입니다.");
			break;
		case 8: // else if -
			System.out.println("B학점입니다.");
			break;
		case 7: // else if -
			System.out.println("C학점입니다.");
			break;
		case 6: // else if -
			System.out.println("D학점입니다.");
			break;
		default: // if - else 에서 else에 해당하는 개념
			System.out.println("과락입니다.");
			break;
		}
		System.out.println("=====================");

		// 1~100 정수의 합을 구하시오
		
		int i;
		int sum = 0;
		for( i=1 ; i <= 100; i=i+1) {
		//for( 1초기값설정 ; 2 5 8 조건식 ; 4 7 증감식 ) {
			sum+= i;
			//3 6 10 sum+= i			
		
		}
		// 20명의 영어 성적을 입력받아 합계와 평균값을 구해주세요.
		
			
		
		
		
		sc.close();
	}
}
