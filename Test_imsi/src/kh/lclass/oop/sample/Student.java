package kh.lclass.oop.sample;

// class 예약어 키워드 abstract는 해당 클래스 내에 abstract 메소드가 0개 이상 있을 것이라는 것을 의미함.

public class Student extends Person {
	private String name; // 학생증용이름
	private int age;
	private char gender;
	private int score;
	private int grade;
	private final int maxCount=10;
	

//	public Student() {
//		super(); //Person()
//		super("김말동",22,'남',1,2); // Person("김말동",22,'남');
//	}
	
	public int getMaxCount() {
		return maxCount;
	}

	public Student(String name, char gender, int age, int grade , int score) {
		super(name, age, gender, grade, score);
		this.name = name;
		this.grade = grade;

	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", score=" + score + ", grade=" + grade
				+ "]";
	}


	
//	@Override
//	Overriding
//	재정의
//	조건 :
//	① 상속한 클래스의 메소드와 동일한 클래스 
//	② 매개변수 자료형, 개수도 동일 // The method getAge(int) of type Student must override or implement a supertype method
//	③ 리턴타입 동일 // The return type is incompatible with Person.getAge()
//	④ 단 제약조건은 달라도 됨. 
//	단 접근제한자는 달라도됨 - 부모 메소드의 접근제한자보다 넓은 범위접근제한자를 설정

	public String getName() {
		return name;
	}	
	public int getAge() {
		return super.getAge() + 1; // 그냥 getAge 하면자기자신만 계속 돌다가 죽어버림. super.를 붙여야 person에서 불러옴
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}
	// 변수선언
	//메소드 정의 // 이 기능은 이러이러한 기능으로 되어있어.
	//메소드 선언 // 이 기능이 있을거야. 있어야해.
	public /*abstract*/ void setGrade(int grade); /* {
		this.grade = grade;*/
	}

}