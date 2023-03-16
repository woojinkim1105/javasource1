package poly;

public class ProductEx2 {

	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		
		buyer.buy(new Tv1());
		buyer.buy(new Computer());
		buyer.buy(new Audio());

		//카트 정보 출력
		buyer.summary();
	}

}
