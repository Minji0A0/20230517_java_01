package kh.lclass;

public class TestFor {

	public static void main(String[] args) {

		// 화면에 1~5까지 display 해줘
		/*
		 * System.out.println(5); System.out.println(4); System.out.println(3);
		 * System.out.println(2); System.out.println(1); 시작 : 5 끝 : 1 step : -1
		 * 
		 */
		System.out.println("while문 사용");
		int num1 = 5;
		int num2 = 1;
		while (num1 >= 1) {
			System.out.println("(" + num1 + "," + num2 + ")");
			// 여기서 하는 행동이 길어지면 증감식 코드를 잊기 쉬움
			num1 = num1 - 1;
			num2 = num2 + 1;
		}
		System.out.println("for문 사용");
		for (num1 = 5, num2 = 1; num1 >= 1; num1 = num1 - 1, num2++) {
			System.out.println("(" + num1 + "," + num2 + ")");
		}

		System.out.println("== 반복 끝 ");

		while (num1 >= 1) {
			System.out.println("(" + num1 + "," + num2 + ")");
			num1 = num1 - 1;
			num2 = num2 * 2;

		}
		System.out.println("for문 사용");
		for (num1 = 5, num2 = 1; num1 >= 1; num1 = num1 - 1, num2 *= 2) {
			System.out.println("(" + num1 + "," + num2 + ")");
		}

		System.out.println("while=====");

		int num5 = 1;
		int num6 = 2;
		while (num5 <= 100) {
			System.out.println("(" + num5 + "," + num6 + ")");
			num5 = num5 + 2;
			num6 = num6 + 2;
		}
		for (num5 = 1, num6 = 2; num5 <= 100 && num6 <= 100; num5 = num5 + 2, num6 = num6 + 2) {
			System.out.println("(" + num5 + "," + num6 + ")");
		}

		System.out.println("== 반복 끝 ");

		/*
		 * 시작 : 1 끝 : 100 STEP : +2 시작 :2 끝 : 100 step : +2
		 */

		int sum = 0;
		int start = 1;
		int end = 100;
		int step = 1;
		int num3 = start;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터" + end + "까지의 합은 " + sum); // 1~100까지의 합산
		// 짝수합을 위한 초기화
		sum = 0;
		step = 2;
		num3 = start;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터" + end + "까지의 짝수 합은 " + sum); // 1~100까지 짝수합

		// 홀수합을 위한 초기화
		sum = 0;
		step = 2;
		num3 = start + 1;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터" + end + "까지의 홀수 합은 " + sum); // 1~100까지 홀수합
		System.out.println("for====");

		int evenSum = 0;
		int oddSum = 0;
		sum = 0;

		for (sum = 0, start = 1, step = 11, num3 = start; // 초기화 - 0
				num3 <= end; // 조건식 -1
				num3 += step) { // 증감식 -3
			sum += num3;
			// 반복문 -2
			if (num3 % 2 == 0) {
				evenSum += num3;
			} else {
				oddSum += num3;
			}
		}
		System.out.println(start + "부터 " + end + "까지의 합은" + sum);
		System.out.println(start + "부터 " + end + "까지의 짝수 합은 " + evenSum);
		System.out.println(start + "부터 " + end + "까지의 홀수 합은 " + oddSum);

		System.out.println("== 반복 끝 ");

		System.out.println("지역 범위 -변수");
		int num8 = 10;
		for (num8 = 1; num8 < 5; num8++) {
			System.out.println(num8);
		}
		System.out.println("====");

		for (int num9 = 1; num9 < 5; num9++) {
			System.out.println(num9);
		}
		System.out.println("====");

		for (int num9 = 3; num9 < 7; num9++) {
		}

		System.out.println("===========구구단 2단 ===========");

		int dan = 2;
		int su = 1; // 1씩 증가, 9까지 변함
		System.out.printf("%d * %d = %2d\n", dan, su, dan * su); // 오른쪽 정렬
		System.out.printf("%d * %d = %2d\n", 9, 9, 81);
		System.out.printf("%d * %d = %-2d\n", dan, su, dan * su); // 왼쪽 정렬
		System.out.printf("%d * %d = %-2d\n", 9, 9, 81);

		System.out.printf("%d * %d = %2d\n", dan, su, dan * su);
		System.out.printf("%d * %d = %2d\n", dan, ++su, dan * su++);

		for (su = 1; su <= 9; su++) {
			System.out.printf("%2d * %2d = %2d\n", dan, su, dan * su);

			System.out.println("=== 구구단 ===");
			for (dan = 2; dan <= 9; dan++) {
				for (su = 1; su <= 9; su++) {
					System.out.printf("%2d * %2d = %2d\n", dan, su, dan * su);
				}
				System.out.println();
			}
		}

		System.out.println("=== 옆으로 구구단 ===");
		// dan=2
		su = 1;
		for (dan = 2; dan <= 9; dan++) {
			System.out.printf("%2d * %2d = %2d", dan, su, dan * su);
		}
		System.out.println();

		su = 2;
		for (dan = 2; dan <= 9; dan++) {
			System.out.printf("%2d * %2d = %2d", dan, su, dan * su);
		}
		System.out.println();

		System.out.println("=== 옆으로 구구단 중첩구문 ===");
//결론
		for (su = 1; su <= 9; su++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%2d * %2d = %2d\t", dan, su, dan * su);
			}
			System.out.println();
		}
		System.out.println("=======break======");
		System.out.println();

		for (su = 1; su <= 9; su++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%2d * %2d = %2d\t", dan, su, dan * su);

				if (dan == 5) {
					break;
				}
			}
			System.out.println();
		}

		System.out.println();

		for (dan = 2; dan <= 9; dan++) {
			for (su = 1; su <= 9; su++) {
				System.out.printf("%2d * %2d = %2d\t", dan, su, dan * su);

				if (su == 5) {
					break;
				}
			}
			System.out.println();
		}

		System.out.println("=======continue======");
		System.out.println("실습 1");
		int total1 = 0;
		int num10;

		for (num10 = 1; num10 <= 100; num10++) {
			if (num10 % 2 == 0)
				;
			continue;
		}
		total1 += num10;

		System.out.println("1부터 100까지의 홀수의 합은 : " + total1 + "입니다.");

		System.out.println("실습 2");
		int total2 = 0;
		for (int i = 1; i < 10; i++) {
			// 방법1
//			if (i % 2 == 0) {
//				continue;
//			}
//			total2 += i;
//		}
		
		  // 방법 2 
			if(i%2 != 0 ) {
				total2 = total2 + i;
			}
			total2 = (i%2 != 0 ) ? total2 + i : total2 ;
			//total2 = (i%2 != 0 ) ? i++ : i--;
		
		 }
		String msg = (total2 > 0) ? "홀수 합계는 %d\n"	:	"합계는 음수일 수 없습니다. %d\n"; 
		if(total2 > 0) {
			msg = "홀수 합계는 %d\n";
		}else {
			msg="합계는 음수일 수 없습니다. %d\n";
		}
		//System.out.printf("홀수 합계는 %d\n", total2);
			System.out.printf(msg , total2);
	}
}
