package pack4;

public class Test51BankMain {
	public static Test51Bank bank = new Test51Bank();
	
	
	
	public static void main(String[] args) {
		// 멀티 스레드의 동기화(synchronized)
		// 공유자원에 Lock을 거는 방법으로 하나의 스레드가 공유자원 사용 시 다른 스레드는 대기 상태에 빠뜨린다.
		// 한 개의 자원을 여러 스레드가 사용하려 할 때 임의 시점에서 하나의 스레드만이 자원을 사용할 수 있도록 함.
		System.out.println("원금: " + bank.getMoney());
		
		Test51Park park = new Test51Park();
		Test51ParkWife parkWife = new Test51ParkWife();
		
		park.start();
		parkWife.start();
	}

}
