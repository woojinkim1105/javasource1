package inheritance;

//Tv 클래스를 상속받은 SmartTv
public class SmartTv2 extends Tv{
	
	boolean caption;
	
		
	public SmartTv2() {
		super(); //부모(Tv2)의 기본생성자 호출
		
	}
	
		
		void displayCaption(String text) {
			if(caption) {
				
				System.out.println(text);
			}
		}
	}


