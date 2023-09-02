package pack4;

public class Test51Bank {
	private int money = 10000;   // 여러 스레드가 공유할 대상
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int save) {  // 입금 - synchronized:스레드의 동기화
		int m = getMoney();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m + save);
		
	}
	
	public synchronized void minusMoney(int mon) {  // 출금
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m - mon);
	}
	
}
