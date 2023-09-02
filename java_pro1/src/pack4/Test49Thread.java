package pack4;

// public class Test49Thread Thread{
// public class Test49Thread implements Runnable{
public class Test49Thread extends Thread{
	public Test49Thread() {
		// TODO Auto-generated constructor stub
	}
	
	public Test49Thread(String name) {
		super(name);
		
	}
	
	public void run() {
		for (int i = 1; i < 50; i++) {
			//System.out.print(i + " ");
			System.out.print(getName() + ":" + i +" ");
			// Runnable 한 경우에는 Thread.currentThread().getName() 한다.
			try {
				Thread.sleep(500);	// 0.5초간 스레드 비활성화
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}  // run이 끝나면 사용자 정의 스레드가 종료

	public static void main(String[] args) throws Exception {   // 하나의 process가 하나의 thread(main thread)를 사용
		// Thread(추상)를 상속받아 처리
		/*
		Test49Thread te1 = new Test49Thread();
		Test49Thread te2 = new Test49Thread();
		te1.run();   // 순차적
		te2.run();   // 얘는 te1.run()이 끝나야 실행이 됨
		*/
		//Test49Thread te1 = new Test49Thread();
		//Test49Thread te2 = new Test49Thread();
		Test49Thread te1 = new Test49Thread("one");
		Test49Thread te2 = new Test49Thread("two");
		
		te1.start();    // start가 run을 호출 => 사용자 정의 스레드가 활성화
		te2.start();
		
		//te1.setPriority(MAX_PRIORITY); //te1의 실행 우선순위를 먼저 요청     0 ~ 10
		te1.setPriority(8);
		
		te1.join();     // te1 작업이 끝날 때까지 main thread의 종료를 대기
		te2.join();
		
		System.out.println("응용 프로그램 종료");
	}

}
