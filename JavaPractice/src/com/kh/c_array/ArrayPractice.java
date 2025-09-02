package com.kh.c_array;

public class ArrayPractice {

	public static void main(String[] args) {
		practice7();
	}
	
	public static void practice7() {
		// 로또번호 6개 숫자 : 1 ~ 45
		int[] lottos = new int[6];
		// 랜덤값 대입
		for(int i=0; i<lottos.length; i++) {
			lottos[i] = (int)(Math.random() * 45 + 1);
			
			//중복 값 확인
			for(int j=0; j<i; j++) {
				// lottos[i] : 현재 인텍스 위치의 값
				// lottos[j] : 0 ~ i-1 위치의 값
				if(lottos[i] == lottos[j]) {
					i--;
					break;
				}
			}
		}
		//출력
		for(int i=0; i<lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
			
		}
	}


