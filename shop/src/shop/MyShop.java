package shop;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyShop implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	
	ArrayList<User> users = new ArrayList<>();
	//product 정보 저장 배열

	ArrayList<Product> products = new ArrayList<>();

	//구매한 제품을 저장할 배열(cart)
//	Product carts[] = new Product[10];
	ArrayList<Product> carts = new ArrayList<>();

	
	//선택된 user 저장
	private int selUser;
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		//User 2명 생성 후 배열에 저장
		users.add( new User("홍길동",PayType.CARD));
		users.add ( new User("성춘향",PayType.CASH));
	}

	@Override
	public void genProduct() {
		//Product 4개(CellPhone 2개, SmartTv 2개) 생성 후 배열에 저장
//		products[0] = new CellPhone("갤럭시 노트 10",500000,"SKT");
//		products[1] = new CellPhone("애플 아이폰 13",900000,"U+");
//		products[2] = new SmartTv("삼성 3D Smart",1500000,"4K");
//		products[3] = new SmartTv("LG Smart Tv",1200000,"FHD");
		products.add(new CellPhone("갤럭시 노트 10",500000,"SKT"));
		products.add(new CellPhone("애플 아이폰 13",900000,"U+"));
		products.add(new SmartTv("삼성 3D Smart",1500000,"4K"));
		products.add(new SmartTv("LG Smart Tv",1200000,"FHD"));
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===============================");
		
//		for (int i = 0; i < users.length; i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
		
		int i = 0;
		for (User user : users) {
			
		}
		
		
		
		
		System.out.println("[x]종  료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+ sel+" 선택 ##");
		System.out.println();

		//0,1 => productList() 호출
		//다른걸 입력시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0); //프로그램 종료
			break;
		case "0": case "1":
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}
	}
	
	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("===============================");
		
		//products 배열 출력
//		for (int i = 0; i < products.length; i++) {
//			System.out.printf("[%d]",i);
//			products[i].printDetail();
//			products[i].printExtra();
//		}
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();
		}
		
		
		
		
		
	
		System.out.println("[h]메인 화면");
		System.out.println("[c]체크 아웃");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+ sel+" 선택 ##");
		System.out.println();

		//0,1 => productList() 호출
		//다른걸 입력시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "0": case "1": case "2": case "3":
			
			for(Product cart : carts) {
				if (cart == null) {
					//(int)로 강제형변환 하려고 했는데 안됨
					//Integer.parseInt()로 가능
					carts.add(products.get(Integer.parseInt(sel)));
					break;
				}
				
			}

			
//			for (int i = 0; i < carts.length; i++) {
//				if (carts[i] == null) {
//					//(int)로 강제형변환 하려고 했는데 안됨
//					//Integer.parseInt()로 가능
//					carts[i] = products[Integer.parseInt(sel)];
//					break;
//				}
//			}			
			productList();
			break;
		case "h": case "H":
			start(); //메인 화면
			break;
		case "c": case "C":
			checkOut(); //체크 아웃
			break;
			
		default:
			System.out.println("입력값을 확인해 주세요\n");
			productList();
			break;
		}
	}

	//체크아웃 : 장바구니에 담겨있는 상품 목록 출력
	//			가격 합계 구하기
	/*	결제방법 : CARD
	 * 	결제금액 : 5000000
	 * 	[p] 이전, [q] 결제완료
	 */
	private void checkOut() {
		System.out.println();
		System.out.println(title + " : 체크아웃");
		System.out.println("===============================");
		
		//carts 출력
		int total = 0; //제품 가격 합계
//		for (int i = 0; i < carts.length; i++) {
//			if (carts[i] != null) {
//				System.out.printf("[%d] %s(%d)\n",i,carts[i].getName(),carts[i].getPrice());
//				total += carts[i].getPrice();
//			}
//		}
		int i = 0;
		for (Product cart : carts) {
			if(cart != null) {
				System.out.printf("[%d] %s(%d)\n",i++,cart.getName(),cart.getPrice());
				total += cart.getPrice();
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("===============================");
		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");	
		String sel = sc.nextLine();
		System.out.println("## "+ sel+" 선택 ##");
		System.out.println();
		
		switch (sel) {
		case "p": case "P":
			productList();
			break;
			
		case "q": case "Q":
			System.out.println("결제완료!");
			System.exit(0);
			break;
			
		default:
			checkOut();
			break;
		}
		
		
	}
}





