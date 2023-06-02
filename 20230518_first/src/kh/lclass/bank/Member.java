package kh.lclass.bank;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {

		// 스캐너 마련

		Scanner sc = new Scanner(System.in);

		System.out.println("통장계설을 원하십니까?");
		String answer = sc.nextLine();
		if (answer.equals("네")) { // (answer=="네") 문자 == 비교할 수 없음.
			System.out.println("주민번호 확인 : ");
			// int strNo = sc.nextInt();
			String strNo = sc.nextLine();
			int sno = Integer.parseInt(strNo);

			System.out.println("이름 확인 : ");
			String strName = sc.nextLine();

			BankAccount ej = new BankAccount(sno, strName);
			BankAccount hj = new BankAccount(123123, "종호", 1012131212);
			BankAccount jh = new BankAccount();
			System.out.println(jh.getSno());// 0
			System.out.println(jh.getName()); // null
			System.out.println(jh.getBalance()); // 0
			System.out.println(jh.getAccountName()); // 내일배움

			jh.sum(1, 3);
			jh.sum("11", 22);
			jh.sum(1, 3, 3);

			BankAccount hj2 = new BankAccount(123123, "종호", 1012131212);
			if (hj2.equals(hj))	System.out.println("hj 같다");
			else				System.out.println("hj 다르다");

			boolean b2 = jh.equals(ej);

			// String
			
			String str1 = "문자";
			String str2 = "문자";
			String str3 = new String();
			String str4 = new String("문자");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3); // "" 같이있는 어떤 문자
			System.out.println(str4);
			
//		for(int i=0; i<10;i++) // ; 를 넣으면 뒤에 sysout계산이 안됨
//		{
//			System.out.println(i);
//		}
			boolean b = str1.equals(str4);
			if (str1.equals(str4))			System.out.println("같다");
			else			System.out.println("다르다");
			
			
			System.out.println(hj);
			System.out.println(hj.toString());
			System.out.println(hj.hashCode());
			
			System.out.println(hj.getSno().MAX_VALUE);
			System.out.println(hj.getSno().toHexString(sno));
			
			
			System.out.println("끝");
			
//			char c = '\'';
//			System.out.printf("한*줄\n한탭\t탭합슬래쉬\\ 따옴표는 어떻게\" ' ?%");  // \\역슬래쉬는 2개 한묶으로 사용 
//			System.out.printf("한줄\n한탭\t탭합슬래쉬\\\\ 따옴표는 어떻게\" ' ?%%%%");  // \\역슬래쉬는 2개 한묶으로 사용 
//	
			System.out.println("안"+2+4); //안24
			System.out.println(2+4+"안"); // 6안
			System.out.println(2*4+"안"); // 8안
			System.out.println("안"+2*4+7); // 안87
			System.out.println(2+4+"안"+7+8); // 6안78
			System.out.println(2+4+"안"+(7+8)); // 6안15
			
			
			String str = "Hello Java";
			System.out.println(str.indexOf(' ')); //주민번호 하이픈 위치, 전화번호 위치, 텍스트 나누기 하고 싶을때 많이 활용함
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(2));
			System.out.println(str.length());
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			String strReplace = str.replace('J','L');
			System.out.println(strReplace);
			
			int idx = str.indexOf(' ');
			String strSubString = str.substring(
												str.indexOf(' ')+1, 
												str.indexOf(' ')+2
												);
			System.out.println(strSubString);
			String strSubString2 = str.substring(5,8);
			System.out.println(strSubString2);
			for (int i = 0; i < str.length(); i++) {
		
			}
			if(str.length() < 3) {
			
			}
			
			
			
			
			
			
			
			
		} else {
			System.out.println("다른 창구를 이용해주세요.");
		}
		sc.close();

	}
}

