package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능 
 * 단, public 클래스는 하나만 존재해야 함
 * 
 * 
 */

class Product{}
class Tv extends Product{}
class Audio extends Product{}


public class GenericsEx2 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
		//? : 와일드 카드
		//<? extends T> : T와 그 자손들만 가능
		//<? super T> : T와 그 조상들만 가능
		
		ArrayList<Product> tvList2 = new ArrayList<>();
		List<Tv> tvList3 = new ArrayList<>();

		
		// ArrayList<Product> : ArrayList에 Product 타입만 추가
		//부모-자식 관계의 객체들은 부모타입으로 선언된 상태여도 자식 객체를 담는 것이 가능
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
	
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
//		tvList.add(new Product());   (x)
		
		printAll(productList);
	}
	
	static void printAll(ArrayList<Product> productList) {
		for (Product product : list) {
			
		}
			System.out.println(product);
		}
	}

}
