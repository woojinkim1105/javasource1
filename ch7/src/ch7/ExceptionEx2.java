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
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		//컴파일러 체크 exception
		try {
			//예외가 발생할 수 있는 구문
			System.out.println(3/1);
		}catch (Exception e) {
			//예외가 발생했을 때 처리하기 위한 구문
			System.out.println(e.getMessage());
		} finally {
			//예외와 상관없이 항상 수행되어야 하는 구문 작성
			System.out.println("반드시 실행");
		}
	}

}











