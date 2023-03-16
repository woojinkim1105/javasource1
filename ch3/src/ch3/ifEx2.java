package ch3;

import java.util.Scanner;

/*
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class ifEx2 {

	public static void main(String[] args) {
		
		int jumsu=70;
		char grade=' ';  //한 칸만 띄워야 함(char : 문자 한 개)
						 // 지역변수는 사용전 초기화가 원칙
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}else { //0~49
			grade='F';
		}
		System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);
		
	}
		

}


