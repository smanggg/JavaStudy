package com.kh.c_array;

import java.util.Scanner;

public class ArrayPrectice {

	public static void main(String[] args) {
		practice4();
	}
	
	public static void practice4() {
		// "월 ~ 일" 까지 초기화된 문자열 배열을 만들기
		// String[] weeks = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 0부터 6까지 숫자를 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		int index = sc.nextInt();
		
		//1
		if(index < 0 || index >= weeks.length) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력
		System.out.println(weeks[index]);
		}
		
		//2
		if(index >= 0 && index < weeks.length) {
			System.out.println(weeks[index]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
