package ch1;

public class VariableEx4 {

	public static void main(String[] args) {
//		// 주석 상세설명
//		
//		/* 리터럴
//		 * 대입되는 값(상수)
//		 * 
//		 * 정수형 : long
//		 * 
//		 */
//		
//		//접미사 : L,f,d
//		long big = 100_000_000_000L; // L을 소문자로 쓰면 구분안되니까
//		float f = 0.14159f;
//		double d = 0.141592d; //d는 필수는 아님
//		
//		//접두사 : 0(8진수), 0x(16진수), 0b(2진수)
//		int octNum = 010;	//8진수 10
//		int hexNum = 0x10;	//16진수
//		int binNum = 0b10;	//2진수 10
//		System.out.println(octNum);
//		System.out.println(hexNum);
//		System.out.println(binNum);
//		
//		// 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은
//		// 허용됨
//		
//		int i = 'A';
//		System.out.println(i);
//		
//		
//		
//		/* 변수명 규칙
//		 * 대소문자 구별, 길이에 제한은 없음
//		 * 예약어 사용 불가 ex) int true; int short
//		 * 숫자로 시작하면 안됨 ex) int 7d;
//		 * 특수문자는 _, $만 허용 ex) int s#arp;
//		 * 
//		 * 변수의 첫 글자는 항상 소문자
//		 * 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다(lastIndexOf)
//		 */ 
//		
		// "" : 문자열
		// String : 참조타입
		String name = "hong";
		
		// 1. name 값 가져오기
		// 2. 문자 77 을 연결하기
		// 3. 연결한 값을 name에 담기
		name = name + " 77"; 
		System.out.println(name);
		
		String num = 7+7+"7";
		System.out.println(num); // 147
		
		
		//printf(): 형식화된 출력 ,  줄바꿈 없음
		// %d : 10진 정수의 형식 출력
		// %c : 문자
		// %s : 문자열
		// %f : 부동소수점
		int age = 25;
		System.out.println("age="+age);
		System.out.printf("age=%10d",age); //%10d 10칸 띄우기
		
		char ch1= 'a';
		String str1 = "abcd";
		double d1 = 3.141592;
		System.out.printf("ch1=%10c\n",ch1);
		System.out.printf("str1=%s\n",str1);
		System.out.printf("%-10s\n",str1);	// -10 왼쪽으로 붙이기
		System.out.printf("d1=%10.3f\n",d1); // .3 은 소수점 3자리까지만 출력
		
		
	}

}
