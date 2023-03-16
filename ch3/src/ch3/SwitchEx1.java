package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch : if ~ else if ~ else 대신 사용
		
//		switch (key) {
//		case value:
//			
//			break;
//		case value:
//			
//			break;
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		int m=7;
		
		if(m==3||m==4||m==5) {
			System.out.println("현재 계절은 봄 ");
		}else if(m==6||m==7||m==8) {
			System.out.println("현재 계절은 여름");
		}else if(m==9||m==10||m==11) {
			System.out.println("현재 계절은 가을");
		}else if(m==12||m==1||m==2) {
			System.out.println("현재 계절은 겨울");
		
		
		}
		
		int month=9;
		
		switch (month) {         //switch에서는 {}가 없기 때문에 break가 필수
		case 3: // month==3 
		case 4: 
		case 5:  
			System.out.println("현재 계절은 봄 ");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름 ");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을 ");
			break;
		case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울 ");
			break;
//		default:
//			break;       디폴트는 지워도 무방
		}
		
		
	}

}
