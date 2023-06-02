package com.kh.test;

public class Overloading {
/*	public void test() {}
	public void test(String str) {}
	public void test(int i) {} 
	public void test(String s) {}
	public void test(char ch) {}
	public void test(String Str, int i) {}
	public void test(int i , String str ) {}
	private void test(int i ) {}
	public int test() {return 0;}
*/
}
// 이거 답 4,5,6,7,11,12 틀린거임... 
//매개변수로 인하여 실행되지 않음.
//4, 12 라인 : 매개변수가 없어 오버로딩 적용되지 않음, 반환 타입은 오버로딩 조건과 무관함
//5, 7 라인 : 매개변수의 개수와 타입이 일치하여 오버로딩 적용되지 않음. 매개변수의 이름은 오버로딩 조건과 무관함.
//6, 11 라인 : 매개변수의 개수와 타입이 일치하여 오버로딩 적용되지 않음. 접근제한자는 오버로딩 조건과 무관함