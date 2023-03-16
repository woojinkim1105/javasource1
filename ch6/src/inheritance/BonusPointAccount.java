package inheritance;

public class BonusPointAccount extends Account {
	//은행 + 보너스 포인트
	private int bonusPoint;
	
	public BonusPointAccount(String ano, String owner, int balance,int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}

	
	//예금기능,
	//보너스 포인트 += 예금액 * 1%
	@Override
	public void deposit(int amount) {
		//예금하다
		super.deposit(amount);
		//보너스 포인트 += 예금액 * 1%
	}
	
	
	
	
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	
	
	
	
	
}
