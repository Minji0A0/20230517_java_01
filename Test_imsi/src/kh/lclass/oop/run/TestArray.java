package kh.lclass.oop.run;

import kh.lclass.oop.sample.Person;
import kh.lclass.oop.sample.Student;

public class TestArray {
	final int a = 10;
	public static void main(String[] arge) {
		
		object obj1 = new Student();
		object obj2 = new Person();
		Person p1 = new Student();
		Student s1 = new Student();
		s1.
		s1.
		
		final int b=11;
		int n = 10;
		for(final int maxCnt=5; n<10; n++) {
			System.out.println("테스트"+n);
		}
		// 방법1
		Person[] personArray2 = new Person[] {new Person(), new Person(), new Person()};
		// 방법2
		Person[] personArray = new Person[22]; // heap에 4byte짜리 주소 담을 방 만드는 new person
		for (int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person();
		} // 방법2부터 여기까지는 하나의 세트와 다름 없다. 통째로외워
				
		Person[] personArray3 = new Person[22];
		// NullPointException
		// 원인 : 일단 . 찾기 → . 앞에 있는 변수(객체 = 인스턴스)가 null인 상태
		// 즉 personArray[0]이 null 주소값을 가지고 있었음.
		// 해결방법 : 변수(객체 = 인스턴스)에 new 생성자 (); 를 적용해줌
		personArray3[0] = new Person(); // new Person[22] 와 여기의 new Person은 아예 다른 존재, 여기서는 위의 친구한테 대입시켜주는 역활
		personArray3[0].setAge(25);
		personArray3[0].setName("김소중");
		personArray3[0].setGender('여');
		
		personArray3[1] = new Person("김개통", 19, '남' , 12, 124,1 );
		personArray3[2] = new Person("김말통", 22, '남' , 13, 125,1);
		
		System.out.println(personArray3[0].getName()); // 김소중
		
		System.out.println("=== studentArr ====");
		Student[] stdArray = new Student[3];
		for(int i=0; i<stdArray.length; i++) {
			stdArray[i] = new Student() {
				@Override
				public void setGrade(int grade) {
					System.out.println("학년 " + 3);
				}
			};
		}
		stdArray[0].setAge(15);
		stdArray[0].setName("김영희");
		stdArray[0].setGender('여');
		stdArray[0].setScore(85);
		stdArray[0].setGrade(3);
		
		System.out.println(stdArray[0].getName()); //김영희
		System.out.println(stdArray[0].getAge()); // 15
		System.out.println(stdArray[0].getGender()); // 여		
		System.out.println(stdArray[0].toString()); // 		
		
		//Student [name=null, score=0, grade=0,
		//toString()=Person [name=김영희, age=15, gender=여]]
		
	
		Student yh = new Student("김영희", '여', 20 , 1, 1) {
			@Override
			public void setGrade(int grade) {
				System.out.println("학년 지정함");
				
			}
		};
		
	}
	
}
	


