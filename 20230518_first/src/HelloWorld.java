import kh.lclass.bank.BankAccount;

public class HelloWorld {	//import java.lang.*;
	public static void main(String[] args) {
		// JVM이 main 메소드를 호출해줌.
//		
//		BankAccount ejkim = new BankAccount();
//		ejkim.accountNo = 1111;
//		ejkim.setName("이제이");
//		ejkim.setBalance(5000); // 여기 오류 해결안됨
//		
//		// 시간이 흘러서...
//		int currentBalance = ejkim.deposit("역삼우리은행ATM3", 5000);
//		System.out.println("잔액" + currentBalance + "입니다.");
//			
		
		final int NUMBER_OF_STUDENT = 10; // = 10 을 따로 분리 해서 작성하지 않는다.
		boolean a1;
		byte a2;	// -128 ~ 0 ~ 127 까지 
		short a3;	//
		int a4;		// 정수 기본연산 자료형
		long a5;	//
		
		float a6;	// 소수점 넣을때 뒤에 f안넣으면 에러남
		double a7;	// 정수 기본연산 자료형
		
		char a8;	//
		
		a1=true;	System.out.println(a1);
		a2=20;		System.out.println(a2);		
		a3=20;		System.out.println(a3);
		a4=20;		System.out.println(a4);
		a5=20;		System.out.println(a5);
		a6=20;		System.out.println(a6);
		a7=20;		System.out.println(a7);
		a8=65; /*65 or 'A'*/		System.out.println(a8);
		a2=20*6;	System.out.println(a2);	
		a5=20l;		System.out.println(a5);
		a5=20L;		System.out.println(a5);
		a6=20.234f;	System.out.println(a6); // 소수점 넣을때 뒤에 f안넣으면 에러남

		/*
		System.out.println("aaa");
		
	
		 public class System {
		 public Abcdef out; // 참조형
		 }
		 
		 public class Abcdef {
		 	public void prinln(String a1){
		 		//console창에 a1 뿌리기
		 		return;
		 		}
		 	}
		 */
	}



}
