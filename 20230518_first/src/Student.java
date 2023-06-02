
public abstract class Student {
//나 아직 일 덜했어 나중에 할일 있어라는 의미로 abstract를 클래스 앞에 붙여서 정의한다.
	private String name;
	private int score;
	public static final String SCHOOL_NAME = "서울대";
	public int sumScore() {
		int result = 0;
		//TODO 
		return result;
	}
	public double avgScore() {
		//TODO
		double result = 0.0;
		return result;
	}
	public abstract void goToSchool();
		//abstract 앱스트릭스 란 추상화 , 선언만 해두고 학생이라는 개체가 나오면, 나중에 그거보고 할래
		//TODO
	
	
}
