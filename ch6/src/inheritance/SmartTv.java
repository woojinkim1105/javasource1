package inheritance;

//Tv 클래스를 상속받은 SmartTv
public class SmartTv extends Tv{
	
	
		// TODO Auto-generated constructor stub
		boolean caption;
		
		void displayCaption(String text) {
			if(caption) {
				
				System.out.println(text);
			}
		}
	}


