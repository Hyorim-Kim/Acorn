package pack4;

public class Test51Park extends Thread{
	@Override
	public void run() {
		Test51BankMain.bank.saveMoney(5000);
		System.out.println("남편 예금 후 잔고:" + Test51BankMain.bank.getMoney());
	}
}
