package ch7;
/* 컴파일에러 : 컴파일시에 발생하는 에러
 * 런타임에러 : 실행시에 발생하는 에러
 * 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 에러(error) : 코드에 의해서 수습될 수 없는 심각한 오류
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * 
 * Exception
 * 1) Exception : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 2) RuntimeException : 프로그래머의 실수로 발생하는 예외
 * 		- 배열 범위 벗어나기, NullPointerException, ClassCastException...
 * 
 * Exception 처리
 * try ~ catch
 * 예외 던지기 : main 메소드를 호출하는 곳(jvm)에서 처리
 */
public class ExceptionEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// java.lang.ArithmeticException: / by zero
	
//		try {
//			System.out.println(3/0);
//			
//		} catch (ArithmeticException e) {
//			e.printStackTrace(); //개발시 자주 쓰는 코드 형태임(예외가 발생하는 구문을 추적해서 출력해주세요)
//			//System.out.println("0으로 나눌 수 없습니다."); //개발자가 원하는 구문 출력
//			System.out.println(e.getMessage()); //예외 발생시 자바가 제공하는 기본메세지 출력
//		}
		
		Class.forName("");
		
		
		
	}	
}
