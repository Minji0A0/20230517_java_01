package kh.lclass;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		String[] strArr = new String[3]; // 배열 생성 or 배열 선언 
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");
		// strArr을 복사함 strCopyArr
		String[] strCopyArr = new String[strArr.length];
		for(int i=0; i < strArr.length; i++) {
			strCopyArr[i] = strArr[i];
		}
		strArr[2] = "orange";
		strCopyArr[1] = "딸기";
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i] + " : " + strCopyArr[i]);
		}
		System.out.println("============");
				
		int a = 10;
		// a.  < 아무것도안나옴
		int[] arrA = new int[3];
		arrA[2] = 20;
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);
		
		System.out.println("==== Arrays.copyOf=====");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 5); // 인셉션이 발생되지 않도록 3개가 데이터의 끝이더라도 해당 숫자'5'만큼 방을 늘려서 null값으로 표현함
		for(int i=0; i<strCopyArr2.length; i++) {
			System.out.println(strCopyArr2[i]);
		}
		
		System.out.println("=== System.===");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);	//1==2번째 의미, 0==첫번째 내용부터 , 2==세번째까지 라는것을 의미
		for(int i=0; i<strCopyArr3.length; i++) {
			System.out.println(strCopyArr3[i]);
		}
				
		String[] strArr2 = {"apple","banana",new String("mango")};
		String[] strArr3 = {new String("apple"),new String("banana"),new String("mango")};
		String[] strArr4 = new String[] {"apple","banana",new String("mango")};
		String[] strArr5 = new String[] {new String("apple"),new String("banana"),new String("mango")};
			
		System.out.println("strArr의 0번째 과일은 "+ strArr[0]);
		System.out.println("strArr의 1번째 과일은 "+ strArr[1]);
		System.out.println("strArr의 2번째 과일은 "+ strArr[strArr.length-1]);

		//for(int i=0; i<= strArr.length-1; i++) { // <= 같다 표시 쓸거면 length -1 해줘야함
		for(int i=0; i<strArr.length; i++) {
			System.out.println("strArr의 " + i+"번째 과일은 " + strArr[i]);
			System.out.printf("strArr의 %d번쨰 과일은 %s\n",i,strArr[i]);
		}
		
		
		
		//오류발생!! IndexOutOfBoundsExeption
		//System.out.println(strArr[1]);

		int[] intArr = new int[3];
		System.out.println(intArr[1]);	
		
		int[] intArr2 = new int[] {1,2,3}; // 이렇게 활용 및 외우기
		int[] intArr3 = {1,2,3};
		
		//Student[] studentArr = new 
	}

}
