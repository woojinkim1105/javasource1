package poly;

public class SmartTvEx2 {

	public static void main(String[] args) {
		
		//참조변수와 인스턴스 타입이 일치
		SmartTv smartTv = new SmartTv();
		
		//조상타입 참조변수로 자손 타입 인스턴스 참조
		// 부모 = new 자식   (다형성)
		Tv tv = new SmartTv();
		
		//참조변수의 타입에 따라 사용할 수 있는 멤버의 개수는 달라짐
		//tv와 smartTv로 접근할 수 있는 범위의 차이가 생김
		
		//SmartTv smartTv2 = new Tv();  자식 = 부모  에러남
		
		
		

	}

}
