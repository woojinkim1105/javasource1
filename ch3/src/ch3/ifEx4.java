package ch3;

import java.util.Scanner;

/*
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class ifEx4 {

	public static void main(String[] args) {
		// 근무 시간 입력받기
		// 8시간 근무시 시간당 9800 일 때
		// 초과근무시 1.5배
		
				
		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요");
//		int hours = Integer.parseInt(sc.nextLine());
//
//		// 8 * 9800 = 일당
//		// 12 시간 근무시 = 
//		int pay;
//		if(hours<=8) {
//			pay = 9800 * hours;
//		}else {
//			pay = (int)(9800 * 8 + 1.5 * 9800 * (hours-8));			
//		}
//		System.out.println("일당은 " + pay );
//		
//		//강사님
//		int rate=9800;
//		int pay2 = 0;
//		if(hours>8) {
//			pay2 = (int)((hours-8) * 1.5 * rate + rate * 8);
//		}else { // hours가 8 이하일 때
//			pay2 = hours * rate;
//		}
//		System.out.println("하루 일당 : " + pay2 );
		
		// 키, 몸무게 입력받기
		// 저체중, 표준, 과체중 출력하는 프로그램 작성
		
		// (키-100)*0.9 < 몸무게 : 과체중
		// (키-100)*0.9 == 몸무게 : 표준
		// (키-100)*0.9 > 몸무게 : 저체중
		// if~else if, if~else if~else
		
//		String body="";
//		System.out.println("키를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게를 입력해주세요");
//		int weight = Integer.parseInt(sc.nextLine()); //parseDouble 도 가능
//		if((height-100)*0.9 < weight) {
//			 body = "과체중";
//		}else if((height-100)*0.9 == weight) {
//			 body = "표준";
//		}else {			
//			 body = "저체중";
//		}
//		System.out.println(body +"입니다." );
		
		//강사님
//		System.out.println("키를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게를 입력해주세요");
//		int weight = Integer.parseInt(sc.nextLine());
//		double result = (height-100)*0.9;
//		if(result < weight) {
//			System.out.println("과체중");
//		}else if(result == weight) {
//			System.out.println("표준체중");
//		}else {
//			System.out.println("저체중");
//		}
		
//		//윤년, 평년 구하기
//		int year=2100;
//		//윤년 : 연도를 4로 나눈 나머지가 0 이고, 연도를 100으로 나눈 나머지가
//		// 		0이 아니거나 연도를 400으로 나머지가 0이면 윤년이다
//		// year%4==0 %% year%100!=0 or year%400==0
//		if( year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("평년");
//		}
		
		// 임의의 숫자 3개 입력받기
		// 입력받은 3개의 숫자 중 가장 작은 수 출력하기
		System.out.println("첫 번째 수를 입력해주세요");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력해주세요");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 수를 입력해주세요");
		int n3 = Integer.parseInt(sc.nextLine());
		
		if(n1<n2) {
			if(n1<n3) {
				System.out.println(n1);
			}else {
				System.out.println(n3);
			}
		}else {
			if(n2<n3) {
				System.out.println(n2);
			}else {
				System.out.println(n3);
			}
//		}
		
		//강사님
		System.out.println("첫 번째 수를 입력해주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력해주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 수를 입력해주세요");
		int num3 = Integer.parseInt(sc.nextLine());
		
		//num1 < num2 && num1 < num3 ==> num1
		int min=num1;
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		System.out.println("가장 작은 수 "+min);
		
		//가장 큰 수 찾기
		int max=num1;
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("가장 큰 수 "+max);
		
	}
	
	
	}	
}

