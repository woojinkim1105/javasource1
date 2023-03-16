package ch2;

/*
 * 연산자
 * 1) 단항연산자
 * 		+(양수), -(음수), ++, --, ~(비트전환, 배우지않음), !
 * 2) 이항연산자
 * 		산술 : +, -, *, /, %, (<<, >>, >>>) 이거는 안할예정
 * 		비교 : >, <, >=, <=, == (값이 같다면), != (값이 같지 않다면)
 * 		논리 : &&(and), ||(or), ^(xor), &(and), |(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =   ex) a=4;
 * 
 * 
 * 연산자 우선순위
 * 
 */
public class OperatorEx2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		//비교연산자 : 결과값은 boolean의 형태로 나옴
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		boolean result = num1==num2;
		System.out.println(result);
		
		//문자끼리 크냐 작냐 비교가 되는가?
		char ch1='A';
		char ch2='B';
		System.out.println("ch1==ch2= "+(ch1==ch2));
		System.out.println("ch1!=ch2= "+(ch1!=ch2));
		System.out.println("ch1>=ch2= "+(ch1>=ch2));
		System.out.println("ch1<=ch2= "+(ch1<=ch2));
		// ==>유니코드 수치로 비교됨
		
		//정밀도
		double d1=0.4;
		float f1=0.4f;
		System.out.println("d1==f1="+(d1==f1));
		System.out.println("d1!=f1="+(d1!=f1));
		System.out.println("d1>=f1="+(d1>=f1));
		System.out.println("d1<=f1="+(d1<=f1));
		
		
	}

}
