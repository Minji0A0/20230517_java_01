package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestPolymophism {
	public static void main(String[] args) {
		
		ArrayList<Car> carArrList	=	new ArrayList<Car>(); // 업캐스팅 안한거임.
		List<Car> carList 			=	new ArrayList<Car>(); //업캐스팅 된거임 // 가장 흔하게 선언하는 방식
		List<Car> carList2 			=	new LinkedList<Car>(); //업캐스팅 된거임 // 가장 흔하게 선언하는 방식
		Collection<Car> carCollection = new ArrayList<Car>();
				
		//오류 new TestInferface();
		TestInterface kh = new Kh();
		Kh kh2 = new Kh();
		
		((Kh)kh).khSpecial();
		
		TestInterface bit;
		TestInterface bit2;
		kh2.khSpecial();
		kh2.method1();
		
		
		Driver ej = new DriverSub();
		ej.setMoney(10000);
		ej.buy(new Sonata()); // buy를 중복해서 쓸수 있는 이유가 오버로딩
		ej.buy(new Avante()); // class Driver public void buy(Car c){ 에 대입하겠다고하는거
				
		Driver jh = new Driver2sub();
		ej.setMoney(1000);
		ej.buy(new Sonata()); // buy를 중복해서 쓸수 있는 이유가 오버로딩
		ej.buy(new Avante()); // class Driver public void buy(Car c){ 에 대입하겠다고하는거
		
	}

}
