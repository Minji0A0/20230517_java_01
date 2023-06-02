package kh.lclass;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너가 가져다가 전원버튼 누름
		// enter key 눌릴때 까지의 데이터를 스캔해줘
		// 예시 ) 1 2 3 가 나 다 (ㄴenter)
		// scan은 데이터 "11 22 33.3 가가가 나나 다 \n\0 " 까지가 한세트로 보관

		String str1 = scan.next(); // 보관하는 데이터중 띄어쓰기 또는 enter전까지의 한덩어리만 리턴해줘
		scan.nextLine(); // flush()
		System.out.println(str1); // 11
		int num1 = scan.nextInt(); // 띄어쓰기 또는 enter전까지의 한덩어리를 정수로 바꿔서 리턴해줘
		scan.nextLine(); // flush()
		System.out.println(num1); // 22
		double num2 = scan.nextDouble();// 띄어쓰기 또는 enter 전까지의 한덩어리를 실수로 바꿔서 리턴해줘
		scan.nextLine(); // flush()
		System.out.println(num2); // 33.3
		String str2 = scan.nextLine(); // 줄바꿈까지의 문자형태로 바꿔서 리턴
		System.out.println(str2); // 가가가 나나 다 \n

		// 모두 엔터키를 누를때까지만 동작함

		System.out.println("입력1");
		int num3 = scan.nextInt();
		scan.nextLine(); // flush() 도 일단 방정리 끝내고 다음줄로 가게 만드는 코드
		System.out.println(num3);

		System.out.println("입력2");
		String str3 = scan.nextLine();
		System.out.println(str3);

		System.out.println("끝");

		scan.close();

	}

}
