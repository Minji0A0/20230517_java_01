package kh.lclass.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.UnaryOperator;

import kh.lclass.oop.sample.Car;

public class TestCollection {
	
	public <E /*extends Number*/ , J> String testGeneric(E a , J b) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		return a.toString()+ "결과값" + b. toString();
	}
	
	public void testStack() {
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.add("하");
		strStack.push("세요");
		System.out.println("strStack.get");
		System.out.println(strStack.get(1));
		System.out.println(strStack);
		System.out.println("strStack.peek");
		System.out.println(strStack.peek()); //가장 나중에 넣은 데이터가 표시되지만 삭제하진않음
		System.out.println(strStack);
		System.out.println("strStack.pop");
		System.out.println(strStack.pop()); // 가장 나중에 넣은 데이터가 추출됨, 그래서 버리고 남겨두지 않음. 메모리공간을 줄여줌
		System.out.println(strStack);
	}
	
	
	public void testHashMap() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("ej", 35.0); // double을 이용해서 소숫점도 입력가능하다. 다른것도 다가능함
		objMap.put("jy", "지영이네");
		objMap.put("hj", new Car(5000));
		System.out.println(objMap.toString());
		System.out.println("jy" + ":" + objMap.get("jy"));
		
		Set<String> keyset = objMap.keySet(); // keyset은 key값을 찾는것
		System.out.println(keyset);
		System.out.println("======= Map : enhanced for ====== ");
		for (String item : keyset) {
			Object value = objMap.get(item);
			System.out.println(item + " : " + value);
		}
		System.out.println("======= Map : Interator for ====== ");
		Iterator<String> itr = keyset.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			String item = itr.next();
			Object value = objMap.get(item); // sysout 끌어오는 부분
			System.out.println(item + " : " + value); // sysout 끌어오는 부분
		}

	}

	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		System.out.println(integerSet);
//		System.out.println(integerSet.toString()); 위에라 아래랑 같은거임 toString은 생략됨

		System.out.println("■■■■■■ Set : enhanced for ■■■■■■");
		for (Integer item : integerSet) {
			System.out.println(item);
		}
		System.out.println("■■■■■■ Set : Iterator ■■■■■■");
		Iterator<Integer> itr = integerSet.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			Integer item = itr.next();
			System.out.println();
		}

	}

	public void testArrayList() {
		String[] strArr1 = new String[3];
		strArr1[0] = "바나나";
		strArr1[1] = "딸기";
//		strArr1[3] = "수박";
		strArr1.clone();
//		System.out.println(strArr1[3]); // 오류발생되는코드!! ArrrayOutOfBoundsException:

		/*
		 * public class ArrayList implements List{ public boolean add(Object e) { e // }
		 * public boolean add(String e) { e // } public boolean add(Integer e) { e // }
		 * public boolean add(Double e) { e // } public boolean add(Car e) { e // }
		 */

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();

		list3.add(new Car(3000));
		list2.add(25);
		list2.add(26);
		list2.add(null);
		list2.add(27);
		list2.add(55);
		list2.add(2, 56); // 끼워넣기 insert index 현재 크기size() 보다 클수는 없다.
		// IndexOutOfBoundsException: Index 1000 out of bounds for length 3
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));

		// 배열 은 for 짝궁

		System.out.println("■■■■■■ List - for■■■■■■");
		for (int i = 0; i < list2.size(); i++) {
			Integer item = list2.get(i);
			System.out.println(list2.get(i));
		}
		System.out.println("■■■■■■ 배열 - for ■■■■■■");
		for (int i = 0; i < strArr1.length; i++) {
			String item = strArr1[i];
			System.out.println(strArr1[i]);
		}
		System.out.println("■■■■■■ enhanced for ■■■■■■");
		// 처음부터 끝까지 한바퀴는 다 돌고 중간 끊기는 되지 않는다.
		for (Integer item : list2) {
			System.out.println(item);
		}

		for (String item : strArr1) {
			System.out.println(item);
		}

		List<String> list10 = new ArrayList<String>();
//		list2.clone();
		if (list1.add("7번")) {
			System.out.println("list1에 추가 성공했습니다.");
		}
		list1.add("1번");
		list1.add("2번");
		list1.add("3번");
		list1.add("2번");
		list1.add(1, "2번 대신 끼워넣기");
//		list.remove("2번");

		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("2번");
		collection1.add("3번");
		list1.removeAll(collection1);
		((ArrayList<String>) list1).clone();

		if (list1 instanceof ArrayList) {
			ArrayList<String> copyList = (ArrayList<String>) (((ArrayList<String>) list1).clone());
			System.out.println(copyList);
		}

//		ArrayList<String> copyList = (ArrayList<String>)(list1.clone());
//		ArrayList<String> copyList = (ArrayList<String>)(((ArrayList<String>)list1).clone());
//		System.out.println(copyList);

//		list.removeAll(list2);
//		list.remove(0);
//		list.clear();;
		System.out.println(list1);
	}


}
