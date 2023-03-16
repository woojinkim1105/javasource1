package ch5;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// 로또번호
		int[] ball = new int[45];
		int[] count = new int[45];
		
	for (int k = 0; k < 700000; k++) { //n번 시행
		for (int i = 0; i < ball.length; i++) {
					ball[i] = i+1;
		}
//		System.out.println(Arrays.toString(ball));
				
		for (int i = 0; i < 6; i++) {
			//0~44 범위의 값 얻기
			int n = (int)(Math.random()*45);
			int temp = ball[i];
			ball[i] = ball[n];
			ball[n] = temp;					
		}		
		System.out.println();
		// 앞 자리 6개 출력
		for (int j = 0; j < 6; j++) {
//			System.out.print(ball[j]+"  ");	
								
			count[ball[j]-1]++;
											
		}
	}//for k 끝
		System.out.println();		
		System.out.println(Arrays.toString(count));

				

	}

}
