package kh.lclass.api;

import java.awt.Menu;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import kh.lclass.vo.TestVo;

import kh.lclass.vo.TestVo;
import static kh.lclass.api.KhCommonApi.*;

public class TestApi {
	public void testDatd() {
		Date when = new Date(2000L);
		// 대부분 deprecated 되어있음.
		System.out.println(when);
		
		Date now = new Date(1000*60*24L);
		System.out.println(now);

		// new Calendar() 오류
		// Cannot instantiate the type Calendar
		// 원인 1. abstract class 2. 생성자 접근제한자 protected
		Calendar c = new GregorianCalendar();  
		// 해결 1
		Calendar c2 = Calendar.getInstance();
		// 해결 2 - Singleton - 디자인패턴 중 하나
		
		TestSingleton ts = TestSingleton.getInstance();
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());
		
		TestSingleton ts2 = TestSingleton.getInstance();
		System.out.println(ts2.getA());
		ts2.setA(100);
		System.out.println(ts2.getA());
		
		System.out.println(c.getTime());
	}

	public void testWrapperwhile() {
		Scanner sc = new Scanner(System.in);
//		public boolean checkMenu(int start, int end, int value) {
//			boolean result = false;
//			if (value < start || value > end) {
//				// 비정상 입력경우
//				System.out.printf("%d - %d 사이 선택해주세요.\n", start, end);
//			} else {
//				result = true;
//			}
//			return result;
//		}
		while (true) {
			// 3번방법
			System.out.println("메뉴 1-5 사이 선택해주세요.");
			int menu = 0;
			try {
				String menuStr = sc.nextLine();
				menu = Integer.parseInt(menuStr);
			} catch (NumberFormatException e) {
			}
			if (!KhCommonApi.checkMenu(1, 5, menu)) {
				continue;

				// NumberFormatException
//				e.printStackTrace(); // NumberFormatException에서 특히 scanner를 통해 입력받았을경우 쓰지 않는다.

			}

//			if (menu < 1 || menu > 5) {
//				// 비정상 입력경우
//				System.out.println("1 - 5 사이 선택해주세요.");
//				continue;
//			}
			// 정상입력경우
			System.out.println("정상적으로 입력되어서... 다른 함수 호출함.");
			testString();
			System.out.println("동작 마침!!!");
			break;

			// 2번방법
//			System.out.println("메뉴 1-5 사이 선택해주세요.");
//			// java.util.InputMismatchException 숫자가 아니라 문자가 입력되었을때 try catch로 막아야함
//			int menu = 0;
//			try {
//				menu = sc.nextInt(); // try안에는 선언자 안씀
//			} catch (InputMismatchException e) {
//				sc.nextLine();
//			}
//			if (menu < 1 || menu > 5) {
//				// 비정상 입력경우
//				System.out.println("1 - 5 사이 선택해주세요.");
//				continue;
//			}
//			// 정상입력경우
//			System.out.println("정상적으로 입력되어서... 다른 함수 호출함.");
//			testString();
//			System.out.println("동작 마침!!!");
//			break;

			// 1 번방법
//			if (menu >0 && menu < 6) {
//				// 정상입력경우
//				System.out.println("정상적으로 입력되어서... 다른 함수 호출함.");
//				testString();
//				System.out.println("동작 마침!!!");
//			} else {
//				// 비정상 입력경우
//				System.out.println("1 - 5 사이 선택해주세요.");
//			}

		}
		System.out.println("testWrapperDoWhile 끝");

	}

	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
//	str2 = "aaaa";  // 사용못함
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "111");
		System.out.println(str3);

		Scanner sc = new Scanner(System.in);
		System.out.println("구분자를 입력해주세요.");
		String token = sc.nextLine();
		System.out.println("내용을 입력해주세요.");
		String content = sc.nextLine();
		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|"); // 이거 엑셀의 텍스트 나누기랑 같은 기능임
		System.out.println(st);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st);

		// 기본자료형 -- > String 변환 방법
		int i = 35;
		double d = 35.0;
		String s1 = String.valueOf(d);
		String s2 = Integer.valueOf(i).toString();
		String s3 = Double.valueOf(d).toString();

		// String -- > 기본자료형으로 변환 하는 방법
		String s = "35";
		// java.lang.NumberFormatException "35.251"
		i = Integer.parseInt(s);
		System.out.println(i);

		System.out.println("==== 끝 ====");

		System.out.println(i);
		System.out.println(i + ":");

		int bnum1 = 10;
		int bnum2 = 11;
		String bcontent2 = "aaaa";
		String bwriter1 = "aa";
		bwriter1 = "bb";

		TestVo tvo = new TestVo(10, "aa");

		TestVo tvo2 = new TestVo(11);
		tvo2.setboardContent("aaaa");
		tvo2.setboardNum(11);

		tvo2.getboardContent();
		tvo.getboardNum();

	}
}
