package pack4;

public class Test52BreadMain {

	public static void main(String[] args) {
		// 스레드 동기화(synchronized) / 스레드의 비활성화, 활성화(wait(), notify())
		Test52BreadPlate breadPlate = new Test52BreadPlate();
		
		Test52BreadMaker maker = new Test52BreadMaker(breadPlate);
		Test52BreadEater eater = new Test52BreadEater(breadPlate);
		maker.setPriority(8);   // maker first
		
		maker.start();
		eater.start();
		
		try {
			maker.join();
			eater.join();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("빵에 대한 이야기 끝");
	}

}
