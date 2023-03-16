package inheritance;

public class CheckAccountEx {
	public static void main(String[] args) {
		CheckintAccount checkingAccount = new CheckingAccount("110-11","홍길동",100000,"4444-5555");
		
		//카드번호 다를 때
		checkingAccount.pay("3333-5555",50000);
		
		//카드번호 동일, 잔액
		checkingAccount.pay("4444-5555",50000);
		System.out.println("사용액 지불 후 잔액 "+balance);

	}

}
