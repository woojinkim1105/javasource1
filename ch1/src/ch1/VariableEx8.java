package ch1;

//형변환 : 강제형변환(casting), 자동형변환(작은 타입 => 큰)
//		boolean을 제외한 나머지 7개의 기본형은 서로 형변환 가능
//정수형 ==> 실수형 ( 큰 문제 없음)
//실수형 ==> 정수형 ( 손실의 위험성 있음 )
//자동형변환
// byte => short, char => int => long => float => double
public class VariableEx8 {
	public static void main(String[] args) {
		int i = 91234567;
		float f = (float)i;
		// 큰 타입을 작은 타입에 담을 때 오류가 난다.
		// 변경 타입을 앞에 꼭 써야 함(casting)
		int i2 = (int)f;
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		// 출력 i2 91234568 ==> 변경이 일어남, 어쩔 수 없음(이진수~~)
		
		byte byteValue = 10;
		int intVal = byteValue; //자동형변환 : 변경타입 생략가능
		System.out.printf("intVal = %d\n",intVal);
		
		char charVal = 'a';
		intVal = charVal;
		System.out.printf("intVal = %d\n",intVal);
		System.out.printf("charVal = %c\n",charVal);
		
		double d = 5.5;
		double result = intVal + d;
		System.out.printf("result = %f\n",result);
		
		//\n: 엔터, ]/t : tab
		System.out.println("abc\tdef");
		System.out.println("abc\\def");
		System.out.println("c:\\");
	}

}
