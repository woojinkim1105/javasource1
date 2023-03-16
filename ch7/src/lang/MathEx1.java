package lang;

//앞에 Math. 을 지울 수 있다.
import static java.lang.Math.*; //import를 static 으로 처리

//Math 클래스 : 기본적인 수학계산에 유용한 메소드로 구성
//생성자가 없음 => new가 안됨(인스턴스 생성 불가) => 모든 메소드, 필드들이 static임

public class MathEx1 {

	public static void main(String[] args) {
//		Math math = new Math(); (x)
		
		System.out.println(Math.E);
		System.out.println(Math.PI);

		//반올림, 올림, 버림
		double val = 90.7552;
		//found() : 반올림
		System.out.println("round("+val+") = "+round(val));
	
		val *= 100;
		System.out.println("round("+val+") = "+round(val));
	
		System.out.println("round("+val+")/100 = "+Math.round(val)/100);
		System.out.println("round("+val+")/100.0 = "+Math.round(val)/100.0);
		System.out.println();
		
		
		//실수 : %f, %3.1f : 출력시 전체 자릿수는 3자리, 소수점은 첫째자리까지
		//ceil() : 올림
		System.out.printf("ceil(%3.1f) = %3.1f\n", 1.1, Math.ceil(1.1));
		//floor() : 버림
		System.out.printf("floor(%3.1f) = %3.1f\n", 1.1, Math.floor(1.5));
	
		//max(),  min()
		System.out.printf("max(%d,%d) = %d\n",5,3,Math.max(5, 3));
		System.out.printf("min(%d,%d) = %d\n",5,3,Math.min(5, 3));
	
	
	
	
	
	}

	private static void max() {
		// TODO Auto-generated method stub
		
	}

}
