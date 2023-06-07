package kh.lclass.api;

public class TestSingleton {  //이건 공식임
	private int a = 10;
	private static TestSingleton instance = new TestSingleton(); // 선언하기
	
	private TestSingleton() {} // private으로 막기
	
	public static TestSingleton getInstance() {
		return instance;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
        
}
