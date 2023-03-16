package inheritance.code;

import modifier.Account;


public class Modifier1 {
	//기본타입은 정수형 0, 실수형 0.0, boolean false로 세팅
	//참조타입은 null로 세팅
	Account acc = new Account();
	
	private void print() {
		//Account가 가지고 있는 ano 접근하고 싶다면?
		String ano = acc.getAno();
		System.out.println("ano : "+ano);
		
		acc.setAno("111-22");
	
	}
	
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		//1. 같은 static으로 만들기
		//또는 2. 객체 생성(new) 후 접근하기
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
		
	//컴파일 오류
	//- 문법이 잘못된 경우 IDE 사용하면 바로 알려줌
	//런타임 오류
	//- 개발 능력 우선(많은 경험)
	//- 순서 밑에서부터
	}

}
