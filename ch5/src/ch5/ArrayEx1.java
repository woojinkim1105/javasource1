package ch5;
/* 배열(array)
 * 같은 타입의 여러 변수를 하나의 묶음을 다루는 방법
 * int score1=98, score2=88, ......;
 * 
 * ==> int score[]; //배열 선언
 * ==> score = new int[30]; //배열 생성
 */
public class ArrayEx1 {

	public static void main(String[] args) {
		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성
		//index 를 이용해서 접근을 할 수 있음
		//int 타입은 0으로 초기화 됨
		int score[]=new int[30]; //선언과 생성 한 번에
		
		System.out.println(score[0]); //0~29 인덱스
		System.out.println(score[15]); //0~29 인덱스
		
		//새로운 값을 할당
		score[0]=98;
		score[1]=88;
		
		//배열선언,생성,초기화
		//가장 자주 쓰는 방법
		
		int score2[]= {98,88,78,68,50,65,81,53,11,45};
		
		System.out.println("5번째 학생의 점수 "+score2[4]); //0부터 시작!!!
		
		double score3[]= {98.6,88.1,78.1,68.5,50.7,65.3,81.4,53.0,11.8,45.2};
		
//		for (int i = 0; i < score3.length; i++) {
//			System.out.printf((i+1)+"번째 학생의 점수 "+score3[i]+"\n");
//			
//		}
		
		
		
		int i =0;
		while (i<=9) {			
			
			System.out.printf((i+1)+"번째 학생의 점수 "+score3[i]+"\n");
			i++;
		}
		
		//char 5개를 담는 배열
		char chArr[]= {'a','b','c','가','나'};
		
		
		//byte, char, short, int, long, float, double, boolean ==> 배열타입가능
		String strArr[]= {"abc","efg"};
		
		// java.lang.ArrayIndexOutOfBoundsException 
		// 런타임 에러 : 실행을 시켰더니 오류
		// 지정할 수 없는 
		System.out.println(strArr[2]);
		
		
		
		
		
		
	}

}
