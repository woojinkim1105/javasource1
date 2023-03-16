package ch6;

public class Calc3 {
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		return sum/2;
	}
	
	//우클릭 toggle break point
	void execute() {
		println("실행결과 : "+avg(7,10)); //f5, f6, f8만 알면 됨
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
	
	
	
	

}
