package ch6;

public class carEx3 {

	public static void main(String[] args) {
		
		//생성자 오버로딩을 통해 초기값이 다양한 객체 생성
		Car3 car = new Car3();
		Car3 car2 = new Car3("현대","쏘렌토","black");
		Car3 car3 = new Car3("현대","쏘렌토","black",200);

	}

}