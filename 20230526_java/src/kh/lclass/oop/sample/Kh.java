package kh.lclass.oop.sample;

import java.io.Serializable;

public /* abstract */ class Kh implements TestInterface, Serializable {

//	static final long serialVersionUID = 1L;
	public void khSpecial() {
		String str = "111112222222222";
		Car[] carArr = new Car[3];
		try {
			System.out.println("1");
//			Car[] carArr = new Car[3];
//			carArr[0] = new Car();
			carArr[4].setPrice(5000); // ArrayIndexOutOfBoundsException
			System.out.println("2");
			carArr[0].setPrice(5000); // NullPointerException
			int a = Integer.parseInt(str); // NumberFormatException
			int c = 10 / 0;
			c = 0 / 10;
//			int a = Integer.parseInt(str);
		} catch (NullPointerException e) {
			System.out.println("예기치 못한 오류 발생하였습니다. 잠시 후 다시 시도해주세요.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 범위를 벗어났습니다.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(Integer.MAX_VALUE + "까지의 정수만 입력해주세요");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눈 수는 나타 낼 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("====== 여기가 마지막 ====== ");

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	} // 추상적인걸 구체적으로 만들어내느 implements

	@Override
	public int method3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Kh [method2()=" + method2() + ", method3()=" + method3() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
