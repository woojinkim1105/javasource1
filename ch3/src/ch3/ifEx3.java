package ch3;

import java.util.Scanner;

/*
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class ifEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
		
		String result = input%2==0?"짝수":"홀수";
		System.out.println(result);
		
		//위 두 줄을 if~else 구조로 바꾸기
		String result=""; // String 이므로 ""
		if(input%2==0) {
			result = "짝수";
		}else {
			result = "홀수";			
		}
		System.out.println(result);
	}
		

}


