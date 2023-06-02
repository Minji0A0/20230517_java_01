package com.kh.practice1.func;

import java.util.Scanner;

public class VariavlePractice1 {
	
//	public VariavlePractice1() {    // 자동으로 생성되어있는 코드
//		super();
//		}
	
	public static int cnt;

	public void method1() {
		System.out.println("여기 실행됨 여기 코딩함");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");;
		String name = sc.nextLine();
		System.out.println("성별을 입력하세요 (남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요 (cm) : ");
		double height = sc.nextDouble();
		System.out.println("키 "+height+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다.^^");
	}


	public void method2() {
/*		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		ex.
		첫 번째 정수 : 23
		두 번째 정수 : 7
		더하기 결과 : 30
		빼기 결과 : 16
		곱하기 결과 : 161
		나누기 몫 결과 : 3
*/
	Scanner sc1 = new Scanner(System.in);
	System.out.print("첫 번째 정수 : ");
	int num1 = sc1.nextInt();
	System.out.print("두 번째 정수 : ");
	int num2 = sc1.nextInt();
	
	System.out.println("첫번째 정수 : " + num1 );
	System.out.println("두번째 정수 : " + num2 );
	System.out.println("더하기 결과 : " + (num1+num2) );
	System.out.println("빼기 결과 : " + (num1 - num2));
	System.out.println("곱하기 결과 : " + (num1 * num2));
	System.out.println("나누기 결과 : " + (num1 / num2 ));
	
	
	
	}
	
	public void method3() {
	
/*		키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		계산 공식 ) 면적 : 가로 * 세로
		둘레 : (가로 + 세로) * 2
		
		ex.
		가로 : 13.5
		세로 : 41.7
		면적 : 562.95
		둘레 : 110.4
*/		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("가로 : ");
		int num3 = sc2.nextInt();
		System.out.print("세로 : ");
		int num4 = sc2.nextInt();
		
		System.out.println("면적 : " + num3*num4);
		System.out.println("둘레 : " + (num3*2)+(num4*2));
		
		
		
		
		
		
		
	}
	
	
}
