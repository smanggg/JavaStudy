package test;

import java.util.Scanner;

public class Paactice2 {
	
	public static void main(String[] args) {
		
		/*System.out.println("첫 번째 숫자 : ");
		System.out.print("두 번째 숫자 : ");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print(num1 + num2); //오답
		*/
		System.out.print("첫 번째 숫자 : ");		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		//System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 1번째 정답
		System.out.printf("%d + %d = %d", num1, num2, num1+num2); //2번째 정답
		
		
	}

}
