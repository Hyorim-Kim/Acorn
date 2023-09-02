package pack4;

public class Test51ParkWife extends Thread{
	@Override
	public void run() {
		Test51BankMain.bank.minusMoney(3000);
		System.out.println("아내 출금 후 잔고:" + Test51BankMain.bank.getMoney());
	}
}
