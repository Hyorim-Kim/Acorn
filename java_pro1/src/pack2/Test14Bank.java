package pack2;

public class Test14Bank {
	// package의 이해 : 접근지정자 허용범위, 다른 클래스의 멤버 참조하기 
	private int money = 1000;   // 잔고
	
	int imsi = 1;
	public int imsi2 = 10;
	
	public Test14Bank() {      // parameter가 없는 생성자
		// TODO Auto-generated constructor stub
	}
	
	public Test14Bank(int money) {
		this.money += money;
	}
	
	public void dePosit(int amount) {   // 입금
		if(amount > 0) money += amount;
	}
	
	public void withDraw(int amount) {  // 출금
		if((amount > 0) && (money - amount) >= 0) {
			money -= amount;
		}else {
			System.out.println("출금액이 너무 많아요");
		}
	}
	
	public int getMoney() {   // 잔금 확인
		return money;
	}	
}
