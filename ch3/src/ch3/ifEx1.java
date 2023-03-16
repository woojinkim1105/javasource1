package ch3;

import java.util.Scanner;

/*
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class ifEx1 {

	public static void main(String[] args) {
		
		// 조건 : true/false 판별되어야 함
		// i==0, i>0, i!=10...  i%2==0
//		if(조건) {
//			//블럭 실행 여부는 조건이 true 일 때만
//		}
		
		int num =0;
		//num 값이 0이라면 num=0 출력하기
		if(num==0) {
			System.out.println("num=0");
		}
		
		//num 값이 0이 아니라면 num!=0 출력하기
		if(num!=0) {
			System.out.println("num!=0");
		}
		
		//score가 60이상이면 합격 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");
		int score=Integer.parseInt(sc.nextLine());
		//이하 자주 나오는 구조
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	
		
		
//		if(조건) {
//			//블럭 실행 여부는 조건이 true 일 때만
//		}else {
//			//false일 때
//		}
		
		//성적 90이상일 때 A, 성적이 80 이상일 때 B, 70 C.....
		
		if(조건) {
			//조건1 true 일 때
		}else if(조건2){
			//조건2 true일 때
		}else if(조건3) {
			//조건3 true일 때
		}
		
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
		}
		System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);
		
	}
		

}


