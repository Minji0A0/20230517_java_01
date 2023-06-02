package kh.lclass;

public class TestOperator {
	public static void main (String[] arge) {
		/*int num1 = 100;
		int num2 = 3;
		double num3 = 3.0;
		System.out.println(num1/num2);
		System.out.println(num1/num3);
		System.out.println(num1%num2);
		System.out.println(num1%num3);
		System.out.println(-(-num1-10));
		System.out.println(+num1);
		System.out.println(++num1);
		
		// 구구단
		
		int a = 1;
		int b = 0; // 처리완료자수
		a = a+1; // 대기번호표를 뽑으면 이렇게 보여짐 , 대기자수와는 다름
		System.out.println(a); // 2
		a = a*2;
		System.out.println(a); // 4
		a *= 2;
		System.out.println(a); // 8
		a = a/4;
		System.out.println(a); // 2
		a %=4;
		System.out.println(a); // 이거 왜 2나오지???
		a +=1;
		System.out.println(a); // 3
		a=a+2;
		System.out.println(a); //5
		a+=2;
		System.out.println(a); // 7
		a++;
		System.out.println(a); //8
		
		System.out.println("전위증감");
		
		a=10;
		System.out.println(++a); //11
		System.out.println(a); // 11
		System.out.println(--a); //10
		System.out.println(a); //10
		
		System.out.println("후위증감");
		a=10;
		System.out.println(a++); // 여기서 ++ 후위증감 //10
		
		System.out.println(a); //11
		System.out.println(a--); //11
		System.out.println(a); //10
		
		System.out.println("비교연산자결과는 true / false ");
		System.out.println(3<7);

		boolean c = !(3<5);
		// 정수값, 실수값, 문자값 등은 true/false로 형변환되지 않음
		// boolean e = !3;
		*/
		int num1 = 10;
		int i = 2;
		boolean value = ((num1 = num1 + 10) < 10) && ((i=i+2)<10);
		//((num1 = num1 + 10) < 10)
		//num1=num1+10; ==>20
		//num1 < 10 ==> false
		//i = i +2 ==>4 , 그러나 앞의 연산이 거짓이었기 때문에 계산하지 않고 2로 종료됨.
		//i < 10 ==> true
		// false && true
		// value = false
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		value=((num1=num1+10)>10) ||((i=i+2)<10);
		//((num1 = num1 + 10) < 10)
		//num1=num1+10; ==>30
		//num1 > 10 ==> true
		// true ||&& 실행하지않음
		// false ||&& 실행함
		//i = i +2 ==> 4
		//i < 10 ==> true
		// value = true
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
	}
}
