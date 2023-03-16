package ch4;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		// 팩토리얼
		// 4! = 4*3*2*1
		
		// 숫자입력받기
		// 팩토리얼 구한 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int fac = 1;
		int n1 = Integer.parseInt(sc.nextLine());
		
		for (int i = n1; i >= 1; i--) {
			fac*=i;
		}
		System.out.printf("%d! = %d",n1,fac);
		
		
	}
}

