package ch1;

import java.util.Scanner;

/*
 * 키보드에서 입력받기
 * 
 * 
 */

public class VariableEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.in : 키보드
		// sc.nextLine() : 문자열로 입력받기 = ""로 받음
		// Integer.parseInt() : 괄호 안에 들어있는 문자숫자를 숫자로 변환
		
		// 1번방법
//		System.out.println("두 자리 정수를 입력해 주세요");
//		int num = Integer.parseInt(sc.nextLine()); 
		
//2번방법
		System.out.println("두 자리 정수를 입력해 주세요");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		System.out.printf("입력숫자 : %d",num);
	}

}
