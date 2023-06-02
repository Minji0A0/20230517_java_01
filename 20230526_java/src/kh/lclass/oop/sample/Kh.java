package kh.lclass.oop.sample;

import java.io.Serializable;

public abstract class Kh implements TestInterface, Serializable {
	
	
//	static final long serialVersionUID = 1L;
	public void khSpecial() {
		
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
