package kh.lclass.io;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 주석은 일반적으로 녹색
	 * 이것은 파란색
	 * JAVA DOCS에 표시됨.	
	 * 여기에 UID 생성날짜, 누가, 무엇때문에 작성하였는지를 남겨야함.
	*/
	private static final long serialVersionUID = 6655830439833572932L;

	protected String name;
	protected int age;
	private transient char gender;
	private transient String password; //transient 를 사용하면 저장이 안됨

	// 기본생성자
	/* 녹색*/
	/** 파랑색 작성위치 여기*/
	
	public Person() {
	}

	// allArgumentsConstuructor 만들어 주세요.
	// allArgumentsConstuructor 란 모든 매개인자를 받아서 처리하는 생성자
	// overloading으로 생성자
	// 필드에 있는 것을 전부 받아와라!

	public Person(String name, int age, char gender) { // 초기값 설정이 안되는 위치임
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender 
				+ "]";
	}
	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
