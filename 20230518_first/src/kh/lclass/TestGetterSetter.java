package kh.lclass;

public class TestGetterSetter {

	private int abc1;
	private long abc2;
	private String abc3;
	private float abc4;
	private double abc5;
	
	//getter / setter
	
	public int getAbc1(/*매개인자 없어도됨 */) {
		return this.abc1;
	}
	public void setAbc1(int b1/* 대입할값을 담을 매개변수 선언 */ ) {
		this.abc1 = b1;
	}
	public long getAbc2() {
		return this.abc2;
	}
	public void setAbc2(long b2) { /* b2 대신 다른 이름을 써도됨, 
	다만 가독성을 위해서 abc2라고 동일하게 기입할수있음. 
	이럴경우에는 꼭 this를 사용해야하나 다른 매개변수를 적었을경우에는 
	this를 사용하지 않아도됨*/
		this.abc2 = b2;
	}
	public String getAbc3() {
		return this.abc3;
	}
	public void setAbc3(String b3) {
		this.abc3 = b3;
	}
	public float getAbc4() {
		return this.abc4;
	}
	public void setAbc4(float b4) {
		this.abc4 = b4;
	}
	public double getAbc5() {
		return this.abc5;
	}
	public void setAbc5(double b5) {
		this.abc5 = b5;
	}
	
}
