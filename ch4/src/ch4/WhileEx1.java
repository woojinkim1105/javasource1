package ch4;

import java.util.Iterator;

/* 반복문
 * 어떤 작업이 반복 수행되도록 할 때 사용
 * 종류 : for(주로 사용), while, do-while
 */
public class WhileEx1 {
	public static void main(String[] args) {
		// 1. int i = 0; 초기화
		// 2. i < 10; 조건식(false 일 때 반복문 종료)*****
		// 3. 조건식이 true일 때 블럭 안으로 진입
		// 4. i++ 증감 i=1
		// 5. 조건식 검사
		// 이런 식으로 조건식이 거짓이 될 때까지 반복하게 됨
		int i = 0;
		while (i < 10) {
			System.out.print(i+"  ");
			i++;
		}
		
		System.out.println();
		
		while (i > 1) {
			System.out.print(i+"  ");
			i--;
		} 
		
		System.out.println();
		
		while (i <=10) {
			System.out.print(i+"  ");
			i+=2;
		}
		
		System.out.println();
		i = 0;						
		while (i < 3) {
			System.out.println("Hello");
			i++;
		}
		
		System.out.println();		
		
		i = 0;
		while (i<=100) {
			System.out.print(i+"  ");
			i++;
		}
		
		System.out.println();
					
		i = 0;
		while (i <= 100) {
			System.out.print(i+"  ");
			i+=2;
		}
		
		System.out.println();
		
		i=0;
		int sum=0;				
		while (i<=10) {
			sum = sum+i;
			i++;
		}
		System.out.print("1~10 합 "+sum);
		
		//1~10까지 덧셈 결과 출력
		//int sum = 1+2+3+4+5+...
		
//		sum=1;
//		sum=sum+2;
//		sum=sum+3;
//		sum=sum+4;
		
		System.out.println();
		
	
		
	}
}

