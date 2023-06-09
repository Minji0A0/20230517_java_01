package com.kh.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 20;
		// SWAP 완전 중요함.
		// a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a); // 20
		System.out.println(b); // 10

		// 버블정렬
		int[] arr = new int[] { 3, 2, 5, 1, 6, 8 };
		System.out.println(Arrays.toString(arr));
		// 배열 ==> List
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 오름차순
//					if (arr[j] < arr[j + 1]){ // 내림차순
					// SWAP
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}

		}
		System.out.print("[");
		for (int ar : arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");

		// 버블정렬
		String[] namearr = new String[] { "손범규", "천영준", "유청하", "김민성" };
		// 배열 ==> List
		System.out.println(Arrays.toString(namearr));
		System.out.print("[");
		for (String ar : namearr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < namearr.length - 1; i++) {
			for (int j = 0; j < namearr.length - 1 - i; j++) {
				if (namearr[j].compareTo(namearr[j + 1]) > 0) { // 오름차순 swap 한다
//				if (namearr[j].compareTo(namearr[j + 1]) < 0) { // 내림차순 바꿔준다.
					// SWAP
					String tmp = namearr[j];
					namearr[j] = namearr[j + 1];
					namearr[j + 1] = tmp;
						}
			}
			}
	
		System.out.print("[");
		for (String ar : namearr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		System.out.println("============");
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String names = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(names , ",");
		List<String> nameList = new ArrayList<String>();
		while (strToken.hasMoreTokens()) {
			nameList.add(strToken.nextToken());
				
		}
		//버블 정렬하기
		sc.close();
	
	}
}