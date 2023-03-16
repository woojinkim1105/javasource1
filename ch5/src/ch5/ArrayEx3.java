package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		//[] : 1차원 배열
		//[][]: 2차원 배열(행,열)
		//[]위치는 타입 뒤에 와도 되고, 배열명 뒤에 와도 됨
		int[] score= {100,88,100,100,90};
			
		//배열 총 합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		// 478/5 	= 95	==> 95.0
		// 478/5.0	= 95.6	==> 95.6		
		average = sum / (float)score.length;
		
		System.out.println("총 합은 "+sum);
		System.out.println("평균은 "+average);
	}

}
