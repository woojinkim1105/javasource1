package ch1;

public class VariableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 메모리의 공간
		// 타입 변수명 = 값; ==> int num = 1
		// 메모리에 어떤 값을 저장할 것인가? 에 따라 타입이 결정됨
		// 문자 : 문자('가'), 문자열("가나다라")
		// 숫자 : 정수 - byte, short, int, long
		// 		 실수 - float, double
		// 논리 : 참(true), 거짓(false)
		
		// 자바 문장의 끝은 세미콜론으로 끝나야 함
		// 변수의 선언(int a;)과 초기화(a=10;)
		
		int a=10, b=5;
		
		System.out.println("a+b");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// 자바 문장의 끝은 세미콜론으로 끝나야 함
				
				// 실수형을 담을 때 기본으로 인식하는 타입은 double 임
				// 정밀도 차이
				double d1 = 0.12345678909;
				float f1 = 0.12345678909f; // 리터럴에 붙는 문자는 대소문자 구별 안함
				//float에 지정하려면 끝에 무조건 f
				System.out.println(d1);
				System.out.println(f1);
				
				// 자동완성 ctrl + spacebar
				boolean b1 = true;
				System.out.println(b1);
				
				String b2="true";
				System.out.println(b2);
				
				// 빈 문자열도 프로그래밍 언어에서는 문자임
				char ch1='a';
				System.out.println(ch1);
				System.out.println(ch1+1); //a : 97, A:65 정해져있는것 ==> 유니코드
				
				//기본타입
				//문자 : char
				//숫자 : 정수(byte,short,int,long)
				//		실수(float,double)
				//논리 : boolean
				
				//두 변수의 값 교환
	}

}
