package kh.lclass.oop.sample;

public class Person {
	protected String name;
	protected int age;
	private char gender;
	private int score;
	private int grade;

	// 기본생성자
	public Person() {}
	
	// allArgumentsConstuructor 만들어 주세요. 
	// allArgumentsConstuructor 란 모든 매개인자를 받아서 처리하는 생성자
	// overloading으로 생성자
	// 필드에 있는 것을 전부 받아와라!

	public Person (String name, int age, char gender, int score, int grade, final int maxCnt) { // 초기값 설정이 안되는 위치임
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.score=score;
		this.grade=grade;
				
		}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", score=" + score + ", grade=" + grade + "]";
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
