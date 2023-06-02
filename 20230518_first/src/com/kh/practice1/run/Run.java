package com.kh.practice1.run;

import com.kh.practice1.func.VariavlePractice1;

public class Run {
	public static void main(String[] arge) {
		System.out.println(VariavlePractice1.cnt); // 기울어진 글자는 static을 의미
		
		// 객체 /인스턴스 vp1을 생성
		VariavlePractice1 vp = new VariavlePractice1();
		
		vp.cnt = 11;
		
		vp.method1();
		vp.method2();
		vp.method3();
		
		/*vp1.v1=11;
		System.out.println(vp1.v1); //11
		System.out.println(vp2.v1); // 10

		vp1.sv=12;
		System.out.println(vp1.sv); //12
		System.out.println(vp2.sv); //12
		
		
			
		new VariavlePractice1().method1();
		new VariavlePractice1().method2();	
*/
		}

}
