package ch5;
/* 변수와 메소드에 static이 붙으면 같은 static 끼리는 문제가 없음
 * static이 붙지 않은 변수나 메소드를 호출하려면 인스턴스 생성 후 가능
 */
public class MemberCall {
	//인스턴스 변수
	int iv=10;
	//static(클래스) qustn
	static int cv=20;
	
	//인스턴스 변수 = 클래스 변수
	int iv2 = cv;
	//클래스변수 = 인스턴스 변수
	//인스턴스 변수의 값을 클래스 변수에 대입 불가
//	static int cv2 = iv;
	
	static void staticMethod1() {
		System.out.println(cv);
	//	System.out.println(iv); ==> new 이후에만 가능
	//	instanceMethod1();
		
		
		
	}
}
