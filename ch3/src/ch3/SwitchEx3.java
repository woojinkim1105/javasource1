package ch3;

public class SwitchEx3 {

	public static void main(String[] args) {
		//임의의 정수 만들기
		System.out.println(Math.random());
		
		// Math.random() : 난수(임의의 수)
		// 0.0 <= Math.random() < 1.0
		
		// 1 ~ 3 범위를 만들고 싶다!
		// (int)0.0 * 3 + 1 <=   < (int)1.0 * 3 + 1
		int dice=(int)(Math.random()*6)+1; // 1~6 사이의 임의의 수 만들기
		switch (dice) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
		
		
		
		}
		
		
	}


