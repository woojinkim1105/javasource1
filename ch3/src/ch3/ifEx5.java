package ch3;

import java.util.Scanner;

/*
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class ifEx5 {

	public static void main(String[] args) {
		//중첩 if
//		if (condition) {
//			if (condition) {
//				
//			}else {
//				
//			}
//		}else {
//			if(condition) {
//				
//			}else {
//				
//			}
//		}

		//점수를 입력 받아서 점수가 90 이상이면 A 인데, 98 이상이라면 A+, 94미만 A-
		//점수를 입력 받아서 점수가 80 이상이면 A 인데, 88 이상이라면 B+, 84미만 B-
		//점수가 80 미만이면 C
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = Integer.parseInt(sc.nextLine());
		char grade = ' ', opt='0';
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt='+';
			}else if(score < 94) {
				opt='-';
			}
			
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt='+';
			}else if(score < 84) {
				opt='-';
			}
		}else {
			grade = 'C';
		}
	
		System.out.printf("성적은 %c%c",grade,opt);  //%c 문자열 출력  왜??
													// printf 때문
		
		
		
		
		
		
	}
}

