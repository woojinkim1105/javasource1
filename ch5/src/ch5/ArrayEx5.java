package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		for (int i = 0; i < 100; i++) {
			//0~9 사이의 임의의 값 구하기
			int value = (int)(Math.random()*10);
			//구한 자리와 0요소랑 값을 교환하기
			//빈 컵을 준비한다
			int temp = numArr[0];
			numArr[0] = numArr[value];
			numArr[value] = temp;
			
			
			
		}
		System.out.println(Arrays.toString(numArr));
	}

}
