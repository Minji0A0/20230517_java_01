package kh.lclass.collection;

import kh.lclass.oop.sample.Car;

public class Main {
public static void main(String[] args) {
	new TestCollection().testStack();
	new TestCollection().testHashMap();
	new TestCollection().testHashSet();
	new TestCollection().testArrayList();
	TestCollection tc = new TestCollection();
	String str = tc.testGeneric(35.5 ,5);
	System.out.println(str);
	str = tc.testGeneric("안녕" , 222L);
	System.out.println(str);
	str = tc.testGeneric(new Car(300), "aaa");
	System.out.println(str);
	
	
}
	
}
